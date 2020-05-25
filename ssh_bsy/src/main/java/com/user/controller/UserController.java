package com.user.controller;

import com.user.model.User;
import com.user.service.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class UserController {



       @Autowired
       private UserTest userTest;


      @RequestMapping(value = "/hel",method= RequestMethod.GET)
      public void  test( User user){

       userTest.addUser(user);

       System.out.println("你好啊");

      }

      @RequestMapping(value = "/test1",method= RequestMethod.GET)
      public String  test1(){


       return userTest.test1();

      }

}
