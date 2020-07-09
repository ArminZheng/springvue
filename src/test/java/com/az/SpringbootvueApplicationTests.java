package com.az;

import com.az.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootvueApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(new Person());
    }

}
