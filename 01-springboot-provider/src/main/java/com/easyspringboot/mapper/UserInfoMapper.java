package com.easyspringboot.mapper;

import com.easyspringboot.module.UserInfo;
import com.easyspringboot.mybatis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    int selectUserByTotal();

    List<UserInfo> selectUserByPage(Map<String,Object> map);
}