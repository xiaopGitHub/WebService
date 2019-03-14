package com.xp;

import com.xp.service.imp.HelloService;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class App 
{
    public static void main( String[] args )
    {
        //发布服务的工厂（基于jax-ws）
        JaxWsServerFactoryBean factoryBean= new JaxWsServerFactoryBean();

        //设置服务地址
        factoryBean.setAddress("http://localhost:8000/ws/hello");

        //设置服务类
        factoryBean.setServiceBean(new HelloService());

        //发布服务
        factoryBean.create();

        System.out.println("发布服务成功，端口8000。。。。。。。。。。。。。。");
    }
}
