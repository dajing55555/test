package com.monitor.dao;


import com.monitor.entity.UserInfo;

public interface UserInfoMapper {
    /**
     * 登陆
     * @param info
     * @return
     */
    UserInfo queryUserByAccountAndPassword(UserInfo info);
}
