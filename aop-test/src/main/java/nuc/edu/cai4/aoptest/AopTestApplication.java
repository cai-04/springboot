package nuc.edu.cai4.aoptest;

import nuc.edu.cai4.aoptest.Config.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);

    }
 /*   @Bean
    public MyAspect getAspect() {
        return new MyAspect();
    }*/

}
