package com.monitor.service.userInfo.impl;

import com.monitor.dao.UserInfoMapper;
import com.monitor.entity.UserInfo;
import com.monitor.service.userInfo.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo login(UserInfo info) {
        return userInfoMapper.queryUserByAccountAndPassword(info);
    }
}
