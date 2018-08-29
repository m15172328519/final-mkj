package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */
public interface UserService {
    public void save(User user);

    public List<User> queryAll();
}
