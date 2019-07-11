package ink.fiany.learnjava.service.impl;

import ink.fiany.learnjava.service.UserService;
import ink.fiany.learnjava.dao.UserMapper;
import ink.fiany.learnjava.entity.User;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fiany
 * @date 2019/7/11 16:03
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert() {
        User user = new User();
        user.setUsername("hai");
        user.setPassword("nnn");
        userMapper.insert(user);
    }

    @Override
    public List<User> select() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> insertAndSelect() {
        User user = new User();
        user.setUsername("hai");
        user.setPassword("nnn");
        userMapper.insert(user);
        // 强制从主库读取数据
        HintManager.getInstance().setMasterRouteOnly();
        return userMapper.selectList(null);
    }
}
