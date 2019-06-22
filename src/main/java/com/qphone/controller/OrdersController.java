package com.qphone.controller;

import com.qphone.pojo.CollectionBean;
import com.qphone.pojo.OrdersBean;
import com.qphone.service.CollectionService;
import com.qphone.service.OrdersService;
import com.qphone.utils.Jiandate;
import com.qphone.utils.Orealid;
import com.qphone.utils.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/6/2.
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CollectionService collectionService;


    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String getInsertone(OrdersBean orders, Model m) {
        CollectionBean cdf = new CollectionBean();
        Float f = Float.valueOf(orders.getOmoney());
        Integer aaaa = f.intValue();
        cdf.setPchou(aaaa);
        cdf.setPname(orders.getOname());
        orders.setPchou(cdf.getPchou());

        CollectionBean coll = collectionService.selectbyname(orders.getOname());
        orders.setPmoney(coll.getPmoney());
        orders.setOweilai(coll.getPcreatetime());
        int datenumber = Jiandate.differentDays(new Date(), orders.getOweilai());

        BigDecimal c = new BigDecimal(datenumber);
        orders.setOshengyu(c);
        orders.setOtime(Time.getNowDate());
        String res = Orealid.getOrderid(orders.getUuid());
        orders.setOrealid(res);
        List<String> list1 = ordersService.selectname();

        if (!list1.contains(orders.getOname())) {
            int a = ordersService.insertone(orders);
            int number = collectionService.updateone(cdf);
        } else {
            System.out.println(1 + "=========================");
            int number = collectionService.updateone(cdf);
        }

        List<OrdersBean> list = ordersService.selectAll();
        m.addAttribute("orders", list);
        return "minecrowdfunding";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteone(@RequestParam("name") String name, Model m) {
        ordersService.deletebyname(name);
        List<OrdersBean> list = ordersService.selectAll();
        m.addAttribute("orders", list);
        return "minecrowdfunding";
    }

    @RequestMapping("/select")
    public String selectall(Model m) {
        List<OrdersBean> list = ordersService.selectAll();
        m.addAttribute("orders", list);
        List<CollectionBean> coll = collectionService.selectbyuuidname(new BigDecimal(1));
        m.addAttribute("coll", coll);
        return "minecrowdfunding";
    }
}
