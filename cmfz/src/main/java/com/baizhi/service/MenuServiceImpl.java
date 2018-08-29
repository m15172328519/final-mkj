package com.baizhi.service;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mkj on 2018/8/29.
 */
@Service
@Transactional
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDao menuDao;

    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Menu> showAll() {
        List<Menu> menus = menuDao.showAll();
        return menus;
    }
}
