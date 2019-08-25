package ink.fiany.learnjava.config;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author fiany
 * @date 2019/8/21 21:17
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    public static void main(String[] args) {
        MyBeanPostProcessor myBeanPostProcessor = new MyBeanPostProcessor();
        myBeanPostProcessor.postProcessAfterInitialization(new Object(),"");
        System.out.println("hell");
    }
}
