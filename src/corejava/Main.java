package corejava;


public class Main {
    public static final Object LOCK = new Object();
    static boolean wait1 = false;
    static boolean wait2 = false;
    private static boolean notified;

    public static void main(String[] args) {

        Thread a = new Thread(() -> new Main().print());
        a.setName("Thread A");

        a.start();

        Thread b = new Thread(() -> new Main().print());
        b.setName("Thread B");
        b.start();
        Thread c = new Thread(() -> new Main().print());
        c.setName("Thread C");
        c.start();

        ///


    }


    public void print() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Thread " + threadName + " inside print");

        synchronized (LOCK) {
            for (int i = 0; i < 20; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i > 5 && !wait1) {
                    try {
                        wait1 = true;
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i > 10 && !wait2) {
                    try {
                        wait2 = true;
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(i + " from " + threadName);
            }
            if(!notified){
            LOCK.notifyAll();
            notified = true;
            }
        }
        System.out.println("Thread " + threadName + " done prinitng");

    }

    class MyThread extends Thread {
        public void test() {

        }
    }

}



