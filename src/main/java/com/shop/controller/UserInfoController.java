package com.shop.controller;

import com.shop.bean.UserInfo;
import com.shop.service.UserInfoService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserInfoController {
    private static final Logger LOGGER = Logger.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/showInfo/{userId}")
    public String showUserInfo(ModelMap modelMap, @PathVariable int userId) {
        LOGGER.info("查看用户：" + userId);
        UserInfo userInfo = userInfoService.getById(1);
        LOGGER.info("用户信息" + userInfo);
        modelMap.addAttribute("userInfo", userInfo);
        return "/user/showInfo";
    }

    @RequestMapping("/showInfos")
    public @ResponseBody List<UserInfo> showUserInfos() {
        LOGGER.info("json返回全部用户的信息");
        List<UserInfo> userInfos = userInfoService.findAll();
        return userInfos;
    }
}
