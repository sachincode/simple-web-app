package com.sachin.simple.service;

import com.sachin.simple.model.Menu;
import com.sachin.simple.model.MenuTree;

import java.util.List;

/**
 * @author shicheng.zhang
 * @date 17-3-19
 * @time 下午10:27
 * @Description:
 */
public interface MenuService {

    List<Menu> queryAllMenus();

    List<Menu> queryByUrl(String url);

    /**
     * 构造菜单
     * @param curMenu 当前展开的菜单
     * @return
     */
    MenuTree getMenuTree(Menu curMenu);

}
