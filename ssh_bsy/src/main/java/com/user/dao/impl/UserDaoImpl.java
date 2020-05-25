package com.user.dao.impl;

import com.user.dao.UserDao;
import com.user.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl  implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
     return this.sessionFactory.openSession();
    }

    @Override
    public void addUser(User user) {
     getCurrentSession().save(user);
    }
}
