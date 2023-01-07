package nuc.edu.cai4.iocconfig;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class IocConfigApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testBean(){
        //ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfiguration.class);
        ApplicationContext context= new AnnotationConfigApplicationContext("nuc.edu.cai4.iocconfig.config");
        System.out.println(context.getBean("configs"));
        //ApplicationContext context = new AnnotationConfigApplicationContext("nuc.edu.cai4.iocconfig.entity");
        //System.out.println(context.getBean(DataConfig.class));
        //System.out.println(context.getBean(GlobalConfig.class));
    }
}
