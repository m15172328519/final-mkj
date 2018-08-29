package com.baizhi.test;

import com.baizhi.dao.MenuDao;
import com.baizhi.entity.Menu;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by mkj on 2018/8/29.
 */
public class TestDao extends BaseTest {
    @Autowired
    MenuDao menuDao;

    @Test
    public void test1(){
        List<Menu> menus = menuDao.showAll();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}
