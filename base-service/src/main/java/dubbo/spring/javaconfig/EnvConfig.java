package dubbo.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by chenyf on 2017/3/15.
 */
@Configuration
public class EnvConfig {
    /**
     * 必须定义为静态方法,而且必不可少
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }

    @Value("${env}")
    public String env;
    @Value("${applicationName}")
    public String applicationName;
    @Value("${registryAddress}")
    public String registryAddress;
    @Value("${annotationPackage}")
    public String annotationPackage;

    //数据库相关
    @Value("${myBatisPath}")
    public String myBatisPath;
    @Value("${jdbcDriver}")
    public String jdbcDriver;
    @Value("${jdbcUrl}")
    public String jdbcUrl;
    @Value("${jdbcUserName}")
    public String jdbcUserName;
    @Value("${jdbcPassword}")
    public String jdbcPassword;
}
