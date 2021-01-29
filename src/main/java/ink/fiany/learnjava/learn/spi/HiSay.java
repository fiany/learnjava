package ink.fiany.learnjava.learn.spi;

/**
 * @author fiany
 * @date 2021/1/27 21:21
 */
public class HiSay implements ISay{
    @Override
    public void say() {
        System.out.println("hi");
    }
}
