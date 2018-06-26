package chapter3.waitAndNotify;

/**
 * 直接执行的话，只能执行到wait上面的代码
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            String lock = new String();
            System.out.println("syn 上面");
            synchronized (lock) {
                System.out.println("syn 第一行");
                lock.wait();
                System.out.println("wait 下面的代码");
            }
            System.out.println("syn 下面");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
