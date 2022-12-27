package Bai18;

public class MainTest implements Runnable{
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        MainTest mainTest = new MainTest();
        Thread t1 = new Thread(mainTest);
        t1.start();
    }
}
