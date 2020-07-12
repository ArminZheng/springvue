package com.az.config;

import com.az.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 当前类是一个配置类， 就是用来替换之前的spring配置文件
 * @Value注解&@Bean都是等价替换之前的<bean>标签属性
 */
@Configuration
public class MyAppConfig {

    //将方法的放回值添加到容器中，容器中的这个组件默认id就是方法名
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
