package nuc.edu.cai4.iocconfig.config;

import nuc.edu.cai4.iocconfig.entity.DataConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean(name = "configs")
    public DataConfig dataConfig() {
        DataConfig dataConfig = new DataConfig();
        dataConfig.setDriverName("Driver");
        dataConfig.setUrl("localhost:3306/dbname");
        dataConfig.setUsername("root");
        dataConfig.setPassword("root");
        return dataConfig;
    }
}
