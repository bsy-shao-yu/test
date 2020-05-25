package com.user.service.impl;

import com.user.dao.UserDao;
import com.user.model.User;
import com.user.service.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTestImpl implements UserTest {

    @Autowired
    private UserDao userDao;


      @Override
      public String test1() {
       return "test";
      }

      public void addUser(User user){
       userDao.addUser(user);
      }


}
