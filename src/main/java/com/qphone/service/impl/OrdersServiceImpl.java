package com.qphone.service.impl;

import com.qphone.dao.OrdersBeanMapper;
import com.qphone.pojo.OrdersBean;
import com.qphone.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/6/2.
 */
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
@Autowired
private OrdersBeanMapper ordersBeanMapper;
    @Override
    public int insertone(OrdersBean orders) {
        return ordersBeanMapper.insertone(orders);
    }

    @Override
    public List<OrdersBean> selectAll() {
        return ordersBeanMapper.selectAll();
    }

    @Override
    public List<String> selectname() {
        return ordersBeanMapper.selectname();
    }

    @Override
    public int deletebyname(String name) {
        return ordersBeanMapper.deletebyname(name);
    }


}
