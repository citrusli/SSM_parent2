package com.dao;


import com.bean.UserInfo;

public interface IUserDao {
    public UserInfo doLogIn(UserInfo userInfo);
}
