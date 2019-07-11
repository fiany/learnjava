package ink.fiany.learnjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("ink.fiany.learnjava.dao")
@SpringBootApplication
public class LearnjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnjavaApplication.class, args);
    }

}
