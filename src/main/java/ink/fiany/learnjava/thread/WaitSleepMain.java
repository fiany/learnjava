package ink.fiany.learnjava.thread;

import java.sql.SQLOutput;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class WaitSleepMain {

    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        new Thread(() ->{
            System.out.println("线程a等待获取锁");
            synchronized (lock) {
                System.out.println("线程a获取到锁，开始执行");
                try {
                    Thread.sleep(20);
                    System.out.println("线程a执行中");

                    lock.wait(1000);
                    System.out.println("线程a执行完毕");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        Thread.sleep(10);
        new Thread(() ->{
            System.out.println("线程b等待获取锁");
            synchronized (lock) {
                System.out.println("线程b获取到锁，开始执行");
                try {
                    Thread.sleep(10);
                    System.out.println("线程b执行中");
                    System.out.println("线程b执行完毕");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
