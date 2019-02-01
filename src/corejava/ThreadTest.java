package corejava;

public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for(int i= 0; i < 5 ; i ++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        System.out.println("complete");
    }
}
