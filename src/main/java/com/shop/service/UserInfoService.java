package com.shop.service;

import com.shop.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    UserInfo getById(Integer id);

    List<UserInfo> findAll();

    Integer save(UserInfo userInfo);
}
