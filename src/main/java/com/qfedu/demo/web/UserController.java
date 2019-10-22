package com.qfedu.demo.web;

import com.qfedu.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @Author: Charles
 * @Description:
 * @Date: Create in 4:34 PM 2019/10/22
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceFestival")
    private UserService userService;

    public void add(){
        userService.add();
    }
}
