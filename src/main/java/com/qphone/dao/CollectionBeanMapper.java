package com.qphone.dao;

import com.qphone.pojo.CollectionBean;

import java.math.BigDecimal;
import java.util.List;

public interface CollectionBeanMapper {


    List<CollectionBean> selectbyfenlei(String name);

    List<CollectionBean> selectall();

    int selectcount();

    CollectionBean selectid(BigDecimal id);

    CollectionBean selectbyname(String name);

    int updateone(CollectionBean coll);

    int insertone(CollectionBean coll);

    BigDecimal selectidbyname(String name);

    List<String> selectbyuuid(BigDecimal uuid);

    List<CollectionBean> selectbyuuidname(BigDecimal uuid);


    List<CollectionBean> index();










}