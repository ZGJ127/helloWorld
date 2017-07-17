package com.shop.test.service;

import com.shop.bean.UserInfo;
import com.shop.service.UserInfoService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })
public class UserInfoServiceTest {

    private static final Logger logger = Logger.getLogger(UserInfoServiceTest.class);

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void testGetById() {
        UserInfo userInfo = userInfoService.getById(1);
        System.out.println("testGetById:" + userInfo);
    }

    @Test
    public void testFindAll() {
        List<UserInfo> list = userInfoService.findAll();
        System.out.println("testFindAll:" + list.get(0));
    }

    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUname("b");
        userInfo.setUnumber(2);
        userInfo.setuRegisterTime(new Date());
        int result = userInfoService.save(userInfo);
        System.out.println("testSave:" + result);
    }

}
