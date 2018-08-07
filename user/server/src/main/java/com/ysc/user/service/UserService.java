package com.ysc.user.service;

import com.ysc.user.dataobject.UserInfo;

public interface UserService {

    /**
     * 通过openid来查询
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
