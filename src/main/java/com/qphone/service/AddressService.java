package com.qphone.service;

import com.qphone.pojo.AddressBean;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2019/6/1.
 */
public interface AddressService {
    int insertone(AddressBean record);

    List<AddressBean> selectbyuser(BigDecimal id);
}
