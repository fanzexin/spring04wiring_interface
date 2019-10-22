package com.qfedu.demo.service.com.qfedu.demo.service.impl;

import com.qfedu.demo.dao.UserDao;
import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 3:05 PM 2019/10/22
 */
@Service
public class UserServiceFestival implements UserService {

    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("注册用户并发送优惠券");
        userDao.add();
    }
}
