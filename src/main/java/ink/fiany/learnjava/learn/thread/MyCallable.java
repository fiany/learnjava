package ink.fiany.learnjava.learn.thread;

import java.util.concurrent.Callable;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("任务开始了");
        Thread.sleep(5000);
        return "hello";
    }
}
