package com.qphone.service.impl;

import com.qphone.dao.UserBeanMapper;
import com.qphone.pojo.UserBean;
import com.qphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
   @Autowired
   private UserBeanMapper userBeanMapper;
    @Override
    public int insertreg(UserBean user) {
        return userBeanMapper.insertreg(user);
    }

    @Override
    public UserBean selectbyname(String name) {
        return userBeanMapper.selectbyname(name);
    }

    @Override
    public List<String> selectname() {
        return userBeanMapper.selectname();
    }
}
