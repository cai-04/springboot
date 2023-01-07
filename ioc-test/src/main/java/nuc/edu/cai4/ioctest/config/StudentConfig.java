package nuc.edu.cai4.ioctest.config;

import nuc.edu.cai4.ioctest.domain.Student;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration(proxyBeanMethods = false)
public class StudentConfig {
    @Bean
    public static Student getStudent() {
        return new Student();
    }
}
