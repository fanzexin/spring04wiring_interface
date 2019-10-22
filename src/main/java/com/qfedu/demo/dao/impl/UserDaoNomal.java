package com.qfedu.demo.dao.impl;

import com.qfedu.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 4:28 PM 2019/10/22
 */
@Repository
public class UserDaoNomal implements UserDao {

    public void add() {
        System.out.println("用户注册到数据库。。。");
    }
}
