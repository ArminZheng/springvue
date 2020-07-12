package com.az.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

//@PropertySource(value = {"classpath:person.properties"})
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * <bean class="Person">
     *     <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEl}></property>
     * </bean>
     * jsr303数据校验 + @Validated (need validation-api)  e.g. @Email (meaning is Email format that must be)
     */

    //@Value("${person.last-name}")
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;
//    @Value("${person.maps}")  no runnable
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;
}
