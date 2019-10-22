package com.qfedu.demo.service;

import com.qfedu.demo.AppConfig;
import com.qfedu.demo.web.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 10:04 AM 2019/10/22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class UserServiceTest {

    @Autowired

    private UserController userController;

    @Test
    public void Test(){

        userController.add();
    }
}
