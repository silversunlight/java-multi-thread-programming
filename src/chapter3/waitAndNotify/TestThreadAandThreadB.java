package chapter3.waitAndNotify;

public class TestThreadAandThreadB {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(100);
            ThreadB b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
