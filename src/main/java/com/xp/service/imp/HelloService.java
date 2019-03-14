package com.xp.service.imp;

import com.xp.service.IHelloService;

/**
 * @Author xp
 * @CreateTime 2019/03/14  19:53
 * @Function ${VAR}
 */
public class HelloService implements IHelloService {
    @Override
    public String sayhello(String name) {
        return "WelCome  " + name + "  !";
    }
}
