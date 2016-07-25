package com.sachin.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shicheng.zhang
 * @date 16-7-25
 * @time 下午10:03
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/string")
    @ResponseBody
    public Object string(@RequestParam String name) {
        return name;
    }

    @RequestMapping("/object")
    @ResponseBody
    public Object object(@RequestParam String name) {
        return new User(name);
    }

    class User {
        public String name;

        public User() {
        }

        public User(String name) {
            this.name = name;
        }
    }
}
