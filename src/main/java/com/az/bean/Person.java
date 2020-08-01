package com.az.bean;

import lombok.Data;
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
    void test(){
        dog.getDHost();//不符合Bean规范
        /**
         * lombok插件会出现一些问题，尽量别用
         * JavaBean规范：
         * 1. 第二个字母大写，属性名直接用作 get/set 的后部分，就是说大小写不变。uName --> getuName/setuName
         * 2. 前两个字母是大写，也直接用作 get/set 的后部分。URL --> getURL/setURL
         * 3. 首字母大写，也是直接用作 get/set 的后部分。Name -->getName/setName，这是最糟糕的，会找不到属性。
         */
    }
}
