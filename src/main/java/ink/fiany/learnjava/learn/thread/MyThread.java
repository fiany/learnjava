package ink.fiany.learnjava.learn.thread;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("当前线程thread" + this.name + " " + i);
        }
    }
}
