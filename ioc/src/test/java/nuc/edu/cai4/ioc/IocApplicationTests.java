package nuc.edu.cai4.ioc;

import nuc.edu.cai4.ioc.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class IocApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    public void testBean(){
        // 获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //XmlBeanFactory beanFactory= new XmlBeanFactory(new ClassPathResource("bean.xml"));
        // 根据beanID获取对象
        // 调用前必须在springContext.xml中配置注解方式解析
        IUserService userService = (IUserService) ac.getBean("customService");
        userService.save();
        //IUserService userService1=(IUserService) ac.getBean("customService");
        //System.out.println(userService1==userService);
    }
}
