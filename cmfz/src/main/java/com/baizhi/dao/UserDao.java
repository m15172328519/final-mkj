package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */
public interface UserDao {
    public void save(User user);

    public List<User> queryAll();

}
