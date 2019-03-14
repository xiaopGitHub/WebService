package com.xp;

import com.xp.service.imp.StudentService;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        JAXRSServerFactoryBean factory=new JAXRSServerFactoryBean();

        //设置服务接口地址
        factory.setAddress("http://localhost:8080/ws/");

        //设置服务实现类
        factory.setServiceBean(new StudentService());

        //发布服务
        factory.create();

        System.out.println("发布接口成功,端口8080。。。。。。。。。");
    }
}
