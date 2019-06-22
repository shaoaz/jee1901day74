package com.qphone.service.impl;

import com.qphone.dao.RewardBeanMapper;
import com.qphone.pojo.RewardBean;
import com.qphone.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/4.
 */
@Service("rewardService")
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardBeanMapper rewardBeanMapper;
    @Override
    public int insertone(RewardBean record) {
        return rewardBeanMapper.insertone(record);
    }
}
