package com.easyspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.easyspringboot.mapper.UserInfoMapper;
import com.easyspringboot.module.UserInfo;
import com.easyspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component//spring的注解，注册为一个bean
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> getUserByPage(Map<String, Object> map) {
        userInfoMapper.selectUserByPage(map);
        return null;
    }

    @Override
    public int getUserByTOtal() {
        userInfoMapper.selectUserByTotal();
        return 0;
    }
}
