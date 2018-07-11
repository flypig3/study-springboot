package com.easyspringboot.service;

import com.easyspringboot.module.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserInfo> getUserByPage(Map<String,Object> map);

    int getUserByTOtal();
}
