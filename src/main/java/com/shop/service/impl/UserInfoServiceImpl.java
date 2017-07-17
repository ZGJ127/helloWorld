package com.shop.service.impl;

import com.shop.bean.UserInfo;
import com.shop.dao.UserInfoDao;
import com.shop.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getById(Integer id) {
        return userInfoDao.getById(id);
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoDao.findAll();
    }

    @Override
    public Integer save(UserInfo userInfo) {
        return userInfoDao.save(userInfo);
    }

}
