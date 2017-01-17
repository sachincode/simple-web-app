package com.sachin.simple.service;

import com.sachin.simple.model.User;

/**
 * @author shicheng.zhang
 * @date 17-1-17
 * @time 下午4:14
 * @Description:
 */
public interface UserService {

    User queryByUsername(String username);
}
