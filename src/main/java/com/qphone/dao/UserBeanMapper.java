package com.qphone.dao;

import com.qphone.pojo.UserBean;
import com.qphone.pojo.UserBeanExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface UserBeanMapper {
   int insertreg(UserBean user);

   UserBean selectbyname(String name);

   List<String> selectname();







    long countByExample(UserBeanExample example);

    int deleteByPrimaryKey(BigDecimal uuid);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    List<UserBean> selectByExample(UserBeanExample example);

    UserBean selectByPrimaryKey(BigDecimal uuid);

    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}