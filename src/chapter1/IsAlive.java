package chapter1;

/**
 * 很奇葩，线程是活动的，但是Thread-0已经死了
 */
public class IsAlive extends Thread{
    public IsAlive() {
        System.out.println("IsAlive begin");
        System.out.println("Thread.currentThread().getName()="+
        Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+
        Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("IsAlive end");
    }

    @Override
    public void run() {
        System.out.println("run begin");
        System.out.println("Thread.currentThread().getName()="+
                Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()="+
                Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive()="+this.isAlive());
        System.out.println("run end");
    }

    public static void main(String[] args) {
        IsAlive isAlive=new IsAlive();
        Thread t1 = new Thread(isAlive, "A");
        System.out.println("main begin t1 isAlive()="+t1.isAlive());
        t1.start();
        System.out.println("main end t1 isAlive()="+t1.isAlive());
    }
}
