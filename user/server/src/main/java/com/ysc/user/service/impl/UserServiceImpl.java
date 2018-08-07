package com.ysc.user.service.impl;

import com.ysc.user.dataobject.UserInfo;
import com.ysc.user.repository.UserInfoRepository;
import com.ysc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired

    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
