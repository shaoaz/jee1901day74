package com.qphone.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/2.
 */
public class Time {



    public static String getNowDate() {
        /*d-M月-yyyy*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ");

       String dat= simpleDateFormat.format(new Date());


        return dat;

        }

    public static String getDate(Date date) {
        /*d-M月-yyyy*/
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日  ");

        String dat= simpleDateFormat.format(date);


        return dat;

    }

    }

