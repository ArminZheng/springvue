package com.az.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    private String name;
    private Boolean gender;
    private int age;
}
