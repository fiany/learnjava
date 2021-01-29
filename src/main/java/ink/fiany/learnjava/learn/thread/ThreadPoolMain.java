package ink.fiany.learnjava.learn.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author fiany
 * @date 2019/4/18
 */
public class ThreadPoolMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(new MyCallable());
        if (!future.isDone()) {
            System.out.println("任务还未完成");
        }
        System.out.println(future.get());
    }
}
