package com.az;

import com.az.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootvueApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void testHelloService(){
        boolean helloService = ioc.containsBean("helloService002");
        System.out.println(helloService);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
