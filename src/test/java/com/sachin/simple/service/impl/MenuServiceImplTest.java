package com.sachin.simple.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.sachin.simple.model.MenuDto;
import com.sachin.simple.model.MenuTree;
import com.sachin.simple.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class MenuServiceImplTest {

    @Resource
    private MenuService menuService;

    @Test
    public void testGetMenuTree() throws Exception {
        MenuTree menuTree = menuService.getMenuTree(null);
        System.out.println(menuTree.getMenuList().size());
    }
}