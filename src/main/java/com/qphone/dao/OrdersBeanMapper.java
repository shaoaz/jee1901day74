package com.qphone.dao;

import com.qphone.pojo.OrdersBean;

import java.util.List;

public interface OrdersBeanMapper {
   int insertone(OrdersBean orders);

   List<OrdersBean> selectAll();

   List<String> selectname();

   int  deletebyname(String name);
}