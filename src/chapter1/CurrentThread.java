package chapter1;

/**
 * Thread.currentThread()和this的差异
 * this会指向一个Thread-0，是run方法的线程
 */
public class CurrentThread  extends Thread{
    public CurrentThread() {
        System.out.println("currentThread begin");
        System.out.println("current " + Thread.currentThread().getName());
        System.out.println("this.getname()" +this.getName());
        System.out.println("currentThread end");
    }

    @Override
    public void run() {
        System.out.println("run--begin");
        System.out.println("current "+Thread.currentThread().getName());
        System.out.println("this.getname()"+this.getName());
        System.out.println("run--end");
    }

    public static void main(String[] args) {
        CurrentThread currentThread=new CurrentThread();
        Thread t1 = new Thread(currentThread, "A");
        t1.start();
    }
}
