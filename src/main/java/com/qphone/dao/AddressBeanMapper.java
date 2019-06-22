package com.qphone.dao;

import com.qphone.pojo.AddressBean;

import java.math.BigDecimal;
import java.util.List;

public interface AddressBeanMapper {

    int insertone(AddressBean record);

    List<AddressBean> selectbyuser(BigDecimal id);


}