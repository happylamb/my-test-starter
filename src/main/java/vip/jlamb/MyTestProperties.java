package vip.jlamb;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jiangyang
 */
@ConfigurationProperties(prefix = "vip.jlamb")
public class MyTestProperties {

    private String test1="默认值test1";

    private String test2="默认值test2";

    public String getTest1() {
        return test1;
    }

    public void setTest1(String test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
