package nuc.edu.cai4.aoptest;

import nuc.edu.cai4.aoptest.Entity.User;
import nuc.edu.cai4.aoptest.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopTestApplicationTests {
@Autowired
    UserService userService;
    @Test
    void contextLoads() {
        //userService.printUser(new User(1,"cai4"));
        userService.printUser(null);
    }

}
