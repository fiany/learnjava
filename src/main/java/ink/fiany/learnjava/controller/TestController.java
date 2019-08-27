package ink.fiany.learnjava.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.Callable;

/**
 * @author fiany
 * @date 2019/7/11 16:00
 */
@Slf4j
@Controller
@RequestMapping("/v1/test")
public class TestController {

    @ResponseBody
    @RequestMapping("/asyn01")
    public DeferredResult<String> asyn01() {
        log.info("hello");
        DeferredResult<String> deferredResult = new DeferredResult<>();
        new Thread(() ->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            deferredResult.setResult("hello success");
        }).start();
        return deferredResult;
    }

    @ResponseBody
    @RequestMapping("/asyn02")
    public Callable<String> asyn02() {
        log.info("hello");
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "success";
            }
        };
        return callable;
    }

}
