package com.qphone.service;

import com.qphone.pojo.UserBean;

import java.util.List;

/**
 * Created by Administrator on 2019/6/5.
 */
public interface UserService {
    int insertreg(UserBean user);

    UserBean selectbyname(String name);

    List<String> selectname();
}
