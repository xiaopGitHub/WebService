package com.xp;

import com.xp.service.IHelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        //获取服务接口访问地址,文档获取: "http://localhost:8000/ws/hello"

        //创建CXF代理工厂,对接口生成代理对象,通过代理对象远程访问服务端
        JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();

        //设置远程访问服务端地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");

        //设置接口类型
        factoryBean.setServiceClass(IHelloService.class);

        //对接口生成代理对象
        IHelloService helloService = factoryBean.create(IHelloService.class);

        //代理对象: class com.sun.proxy.$Proxy35
        System.out.println(helloService.getClass());

        //远程访问服务
        System.out.println(helloService.sayhello("tom"));
    }
}
