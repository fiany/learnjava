package ink.fiany.learnjava.learn.thread;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class MyRunnable implements Runnable {


    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("当前线程runnable" + this.name + " " + i);
        }
    }
}
