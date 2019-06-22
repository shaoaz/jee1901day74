package com.qphone.controller;

import com.qphone.pojo.AddressBean;
import com.qphone.pojo.CollectionBean;
import com.qphone.service.AddressService;
import com.qphone.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2019/6/1.
 */
@Controller
@RequestMapping("/address")
public class AddressContorller{
    @Autowired
    private CollectionService collectionService;
    @Autowired
    private AddressService addressService;
    private AddressBean address;
    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public String insertAddress(@RequestParam("uuid") BigDecimal uuid, @RequestParam("id") BigDecimal id,  AddressBean addr, Model m) {


        CollectionBean coll = collectionService.selectid(id);
        m.addAttribute("coll", coll);

        if(addr!=null && !addr.equals(address)){
            addressService.insertone(addr);
            address=addr;
        }

        List<AddressBean> addr1 = addressService.selectbyuser(uuid);
        m.addAttribute("addr", addr1);

        return "pay-step-2";
    }


}
