package ink.fiany.learnjava.service;

import ink.fiany.learnjava.entity.User;

import java.util.List;

/**
 * @author fiany
 * @date 2019/7/11 16:03
 */
public interface UserService {

    void insert();

    List<User> select();

    List<User> insertAndSelect();
}
