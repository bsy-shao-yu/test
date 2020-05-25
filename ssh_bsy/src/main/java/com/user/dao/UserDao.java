package com.user.dao;

import com.user.model.User;

import java.io.Serializable;

public interface UserDao<T,PK extends Serializable> {
 void addUser(User user);
}
