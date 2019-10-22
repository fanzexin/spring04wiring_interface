package com.qfedu.demo.service.com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 9:56 AM 2019/10/22
 */
@Service
public class UserServiceNormal implements UserService {

    public void add() {
        System.out.println("添加用户测试11");
    }
}
