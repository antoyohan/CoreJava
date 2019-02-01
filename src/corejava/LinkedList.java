package corejava;


public class LinkedList {
    static java.util.LinkedList mLIst = new java.util.LinkedList<String>();

    public static void main(String[] args) {
        mLIst.add("test");
        mLIst.add("test1");


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
        thread.start();
        try {
            thread.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test");

    }
}
