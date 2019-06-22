package com.qphone.service;

import com.qphone.pojo.OrdersBean;

import java.util.List;

/**
 * Created by Administrator on 2019/6/2.
 */
public interface OrdersService {
    int insertone(OrdersBean orders);

    List<OrdersBean> selectAll();

    List<String> selectname();

    int  deletebyname(String name);
}
