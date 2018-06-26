package chapter3.waitAndNotify;

import java.util.concurrent.TimeUnit;

public class TestMyThread1AndMyThread2 {
    public static void main(String[] args) {
        try {
            Object lock=new Object();
            MyThread1 t1 = new MyThread1(lock);
            t1.start();
//            Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(3);
            MyThread2 t2 = new MyThread2(lock);
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
