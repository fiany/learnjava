package ink.fiany.learnjava.learn.thread;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class SynchronizedMain {

    private static int num = 0;

    public static void increase() {
        num++;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                SynchronizedMain.increase();
            }).start();
            System.out.println(i);
        }
        Thread.sleep(10000);
        System.out.println("result:" + SynchronizedMain.num);
    }
}
