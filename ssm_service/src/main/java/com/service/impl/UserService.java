package com.service.impl;

import com.bean.UserInfo;

import com.dao.IUserDao;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public Boolean doLogIn(UserInfo userInfo) {
        UserInfo userInfo1 = iUserDao.doLogIn(userInfo);
        if(null != userInfo1){
            return true;
        }
        return false;
    }
}
