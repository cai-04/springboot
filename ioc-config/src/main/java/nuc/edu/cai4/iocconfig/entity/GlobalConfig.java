package nuc.edu.cai4.iocconfig.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class GlobalConfig {
    @Value("8088")
    private String port;
    @Value("/")
    private String path;
    @Autowired//bytype
    @Qualifier("config")//byname
   // private DataConfig dataConfig;
    private DataConfig config;
}
