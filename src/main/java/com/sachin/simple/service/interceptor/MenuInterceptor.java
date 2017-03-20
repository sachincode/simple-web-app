package com.sachin.simple.service.interceptor;

import com.sachin.simple.model.Menu;
import com.sachin.simple.model.MenuTree;
import com.sachin.simple.service.MenuService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author shicheng.zhang
 * @date 17-3-20
 * @time 上午10:37
 * @Description:
 */
public class MenuInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private MenuService menuService;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        if (modelAndView != null) {
            List<Menu> menus = menuService.queryByUrl(request.getRequestURI());
            Menu menu = null;
            if (CollectionUtils.isNotEmpty(menus)) {
                menu = menus.get(0);
                modelAndView.addObject("page_title", menu.getMenuName());
            }
            MenuTree menuTree = menuService.getMenuTree(menu);
            modelAndView.addObject("sys_menu_list", menuTree.getMenuList());
            modelAndView.addObject("sys_crumb_list", menuTree.getCrumbList());
        }
    }
}