package com.sachin.simple.service.impl;

import com.sachin.simple.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author shicheng.zhang
 * @date 16-7-26
 * @time 上午11:48
 * @Description:
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
