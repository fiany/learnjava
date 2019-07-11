package ink.fiany.learnjava.thread;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class ThreadMain {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("thread1");
        MyThread myThread2 = new MyThread("thread2");
        myThread1.start();
        myThread2.start();


        MyRunnable runnable1 = new MyRunnable("run1");
        MyRunnable runnable2 = new MyRunnable("run2");
        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
