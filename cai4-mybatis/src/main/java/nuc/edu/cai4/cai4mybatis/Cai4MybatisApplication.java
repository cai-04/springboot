package nuc.edu.cai4.cai4mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("nuc.edu.cai4.cai4mybatis.mapper")
public class Cai4MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cai4MybatisApplication.class, args);
    }

}
