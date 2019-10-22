package com.qfedu.demo.service.com.qfedu.demo.service.impl;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 3:05 PM 2019/10/22
 */
@Component
@Qualifier("festival")
public class UserServiceFestival implements UserService {

    public void add() {
        System.out.println("注册用户并发送优惠券");
    }
}
