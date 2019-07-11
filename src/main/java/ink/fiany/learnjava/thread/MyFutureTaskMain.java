package ink.fiany.learnjava.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class MyFutureTaskMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyCallable());
        new Thread(task).start();
        if (!task.isDone()) {
            System.out.println("任务未完成");
        }
        System.out.println(task.get());

    }
}
