package com.az.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity  //这是一个实体类
@Table(name = "tb_user")  //指定和哪个数据表对应；如果省略就代表是类名小写
public class User {

    @Id //这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增
    private Integer id;

    @Column(name = "last_name",length = 50) //和数据表对应的一个列
    private String lastName;

    @Column
    private String email;  //省略默认列名就是属性名
}
