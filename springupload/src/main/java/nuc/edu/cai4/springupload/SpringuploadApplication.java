package nuc.edu.cai4.springupload;

import nuc.edu.cai4.springupload.util.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringuploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringuploadApplication.class, args);
        System.out.println("swagger-ui地址："+"http://127.0.0.1:3000/swagger-ui.html\n" +
                "\n");
    }

}
