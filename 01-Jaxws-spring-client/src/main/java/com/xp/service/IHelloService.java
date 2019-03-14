package com.xp.service;

import javax.jws.WebService;

/**
 * @Author xp
 * @CreateTime 2019/03/14  19:51
 * @Function 对外发布服务的借口
 */
@WebService   //标注为WebService的接口
public interface IHelloService {

    /**
     * 对外发布服务接口的方法
     * */
    public String sayhello(String name);
}
