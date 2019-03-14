package com.xp.service.imp;

import com.xp.entity.Student;
import com.xp.service.IStudent;

/**
 * @Author xp
 * @CreateTime 2019/03/14  22:41
 * @Function ${VAR}
 */
public class StudentService implements IStudent {

    @Override
    public String say1() {
        return "POST";
    }

    @Override
    public String say2() {
        return "PUT";
    }

    @Override
    public Student say3() {
        Student student=new Student();
        student.setId(1);
        student.setName("tom");
        student.setGrade("大学");
        return student;
    }

    @Override
    public String say4() {
        return "DELETE";
    }
}
