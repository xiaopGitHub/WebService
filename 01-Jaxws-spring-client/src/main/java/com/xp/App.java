package com.xp;

import com.xp.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //生成接口代理类
        IHelloService helloService = (IHelloService) context.getBean("helloService");
        System.out.println(helloService.getClass());

        //调用远程服务接口
        System.out.println(helloService.sayhello("jack"));
    }
}
