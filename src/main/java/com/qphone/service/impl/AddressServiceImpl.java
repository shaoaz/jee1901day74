package com.qphone.service.impl;

import com.qphone.dao.AddressBeanMapper;
import com.qphone.pojo.AddressBean;
import com.qphone.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2019/6/1.
 */
@Service("addressService")
public class AddressServiceImpl implements AddressService{
    @Autowired
    private AddressBeanMapper addressBeanMapper;
    @Override
    public int insertone(AddressBean record) {
        return addressBeanMapper.insertone(record);
    }

    @Override
    public List<AddressBean> selectbyuser(BigDecimal id) {
        return addressBeanMapper.selectbyuser(id);
    }
}
