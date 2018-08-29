package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */
@Service
@Transactional
public class UserServcieimpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
