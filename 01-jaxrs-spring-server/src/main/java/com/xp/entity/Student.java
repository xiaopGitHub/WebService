package com.xp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author xp
 * @CreateTime 2019/03/14  22:36
 * @Function ${VAR}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "student")   //指定对象序列化为xml或json数据时,根节点的名称
public class Student {

    private int id;
    private String name;
    private String grade;
}
