package com.qphone.service.impl;


import com.qphone.dao.CollectionBeanMapper;
import com.qphone.pojo.CollectionBean;
import com.qphone.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2019/5/30.
 */
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    private CollectionBeanMapper collectionBeanMapper;


    @Override
    public List<CollectionBean> selectbyfenlei(String name) {
        return collectionBeanMapper.selectbyfenlei(name);
    }

    @Override
    public List<CollectionBean> selectall() {
        return collectionBeanMapper.selectall();
    }

    @Override
    public int selectcount() {
        return collectionBeanMapper.selectcount();
    }

    @Override
    public CollectionBean selectid(BigDecimal id) {
        return collectionBeanMapper.selectid(id);
    }

    @Override
    public CollectionBean selectbyname(String name) {
        return collectionBeanMapper.selectbyname(name);
    }

    @Override
    public int updateone(CollectionBean coll) {
        return collectionBeanMapper.updateone(coll);
    }

    @Override
    public int insertone(CollectionBean coll) {
        return collectionBeanMapper.insertone(coll);
    }

    @Override
    public BigDecimal selectidbyname(String name) {
        return collectionBeanMapper.selectidbyname(name);
    }


    @Override
    public List<String> selectbyuuid(BigDecimal uuid) {
        return collectionBeanMapper.selectbyuuid(uuid);
    }

    @Override
    public List<CollectionBean> selectbyuuidname(BigDecimal uuid) {
        return collectionBeanMapper.selectbyuuidname(uuid);
    }

    @Override
    public List<CollectionBean> index() {
        return collectionBeanMapper.index();
    }
}
