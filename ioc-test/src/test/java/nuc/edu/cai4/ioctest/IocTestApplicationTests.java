package nuc.edu.cai4.ioctest;

import nuc.edu.cai4.ioctest.domain.Person;
import nuc.edu.cai4.ioctest.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

@SpringBootTest
class IocTestApplicationTests {
    //1.基于配置文件
    @Test
    public  void testIoc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student)applicationContext.getBean("student");
        //System.out.println(student);
        System.out.println(student.getStu_id());
        System.out.println(student.getStu_name());
    }
    //2.基于配置类
    @Test
    public void testAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("nuc.edu.cai4.ioctest.config");
        Student student = (Student) applicationContext.getBean(Student.class);
        System.out.println(student.getClass());
    }
    //3.使用注解实例化
    @Autowired
            //@Qualifier
            //@Resource
    //Student student;
    Person student;




    @Test
    void contextLoads() {
        //System.out.println(student.getStu_id());
        //System.out.println(student.getStu_name());
        //System.out.println(students);
        System.out.println(student.getClass());
    }
}
