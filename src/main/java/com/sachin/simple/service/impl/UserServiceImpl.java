package com.sachin.simple.service.impl;

import com.google.common.base.Preconditions;
import com.sachin.simple.dao.UserMapper;
import com.sachin.simple.model.User;
import com.sachin.simple.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shicheng.zhang
 * @date 17-1-17
 * @time 下午4:14
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryByUsername(String username) {
        Preconditions.checkArgument(StringUtils.isNotBlank(username));
        return userMapper.queryByUsername(username);
    }
}
