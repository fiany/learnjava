package ink.fiany.learnjava.learn.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * java spi测试
 * @author fiany
 * @date 2021/1/27 21:20
 */
public class TestSpi {

    public static void main(String[] args) {
        ServiceLoader<ISay> load = ServiceLoader.load(ISay.class);
        Iterator<ISay> iterator = load.iterator();
        while (iterator.hasNext()) {
            ISay next = iterator.next();
            next.say();
        }
    }
}
