package com.xp;

import com.xp.entity.Student;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        //通过WebClient对象远程调用服务接口
        Student student = WebClient.create("http://localhost:8080/ws//stuService/stu")
                //设置返回数据格式
                .type(MediaType.APPLICATION_JSON)
                //指定响应的数据格式
                .accept("json")
                .get(Student.class);

        System.out.println(student);
    }
}
