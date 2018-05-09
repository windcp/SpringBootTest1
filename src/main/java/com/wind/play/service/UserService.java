package com.wind.play.service;

import com.wind.play.dao.UserDao;
import com.wind.play.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDao {

    @Autowired
    private UserDao userDao;

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public User selectByPrimaryKey(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
