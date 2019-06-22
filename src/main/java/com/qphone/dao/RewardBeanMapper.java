package com.qphone.dao;

import com.qphone.pojo.RewardBean;
import com.qphone.pojo.RewardBeanExample;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface RewardBeanMapper {

    int insertone(RewardBean record);










    long countByExample(RewardBeanExample example);

    int deleteByPrimaryKey(BigDecimal rid);



    int insertSelective(RewardBean record);

    List<RewardBean> selectByExample(RewardBeanExample example);

    RewardBean selectByPrimaryKey(BigDecimal rid);

    int updateByExampleSelective(@Param("record") RewardBean record, @Param("example") RewardBeanExample example);

    int updateByExample(@Param("record") RewardBean record, @Param("example") RewardBeanExample example);

    int updateByPrimaryKeySelective(RewardBean record);

    int updateByPrimaryKey(RewardBean record);
}