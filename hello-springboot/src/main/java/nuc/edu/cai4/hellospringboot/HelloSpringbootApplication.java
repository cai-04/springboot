package nuc.edu.cai4.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringbootApplication.class, args);
        System.out.println("spring is running......");
    }

}
