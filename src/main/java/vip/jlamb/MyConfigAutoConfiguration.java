package vip.jlamb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MyTestProperties.class)
@ConditionalOnClass(MyConfig.class)
@ConditionalOnProperty(prefix = "vip.jlamb", value = "enabled", matchIfMissing = true)
public class MyConfigAutoConfiguration {

    @Autowired
    private MyTestProperties myTestProperties;

    @Bean
    public MyConfig myConfig(){
        MyConfig myConfig = new MyConfig();
        myConfig.setProperty1(myTestProperties.getTest1());
        myConfig.setProperty2(myTestProperties.getTest2());
        return myConfig;
    }


}
