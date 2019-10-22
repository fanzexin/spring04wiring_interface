package com.qfedu.demo.service.com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 9:56 AM 2019/10/22
 */
@Component
public class UserServiceNormal implements UserService {

    public void add() {
        System.out.println("添加用户");
    }
}
