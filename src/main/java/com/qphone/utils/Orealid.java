package com.qphone.utils;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Random;

/**
 * Created by Administrator on 2019/6/2.
 */
public class Orealid {
    public static String getOrderid(BigDecimal uuid){
        Calendar c=Calendar.getInstance();
        Random r=new Random();
        int res=r.nextInt(9000)+1000;
        return ""+c.get(1)+c.get(2)+c.get(5)+uuid+res;
    }
}
