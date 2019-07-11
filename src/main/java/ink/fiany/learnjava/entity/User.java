package ink.fiany.learnjava.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author fiany
 * @date 2019/7/11 16:04
 */
@Data
@TableName("user")
public class User {
    private int id;
    private String username;
    private String password;
}
