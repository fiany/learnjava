package ink.fiany.learnjava.controller;

import ink.fiany.learnjava.entity.User;
import ink.fiany.learnjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fiany
 * @date 2019/7/11 16:02
 */
@RequestMapping("/v1/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    public String insert() {
        userService.insert();
        return "success";
    }

    @GetMapping("/select")
    public List<User> select() {
        return userService.select();
    }


    @GetMapping("/insertselect")
    public List<User> insertselect() {
        return userService.insertAndSelect();
    }

}
