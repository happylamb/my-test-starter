package vip.jlamb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService2Impl implements MyService2{

    @Autowired
    private MyTestProperties myTestProperties;

    @Autowired
    private MyService myService;


    @Override
    public String tesst2() {
        return myService.test();
    }
}
