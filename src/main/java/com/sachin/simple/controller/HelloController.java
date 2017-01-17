package com.sachin.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author shicheng.zhang
 * @date 16-7-25
 * @time 下午10:03
 * @Description:
 */
@Controller
public class HelloController {

    @RequestMapping("ex")
    public ModelAndView ex() {
        throw new RuntimeException("测试异常");
    }

    @RequestMapping("sayhi.do")
    @ResponseBody
    public Object sayHi(@RequestParam("name") String name) {
        return "hello, " + name;
    }
}
