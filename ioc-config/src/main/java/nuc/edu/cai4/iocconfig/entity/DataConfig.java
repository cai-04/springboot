package nuc.edu.cai4.iocconfig.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("config")//告诉框架需要加载到ioc中
public class DataConfig {
    @Value("localhost:3306")
    private String url;
    @Value("Driver")
    private String driverName;
    @Value("root")
    private String username;
    @Value("root")
    private String password;
}
