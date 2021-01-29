package ink.fiany.learnjava.learn.proxy;

/**
 * @author fiany
 * @date 2021/1/28 21:54
 */
public class UserImpl implements IUser{
    @Override
    public void select() {
        System.out.println("查询方法");
    }
}
