package com.qphone.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019/6/3.
 */
public class Jiansanshi {

  public static Date getDate(int a){
      Calendar cal = Calendar.getInstance();
      cal.add(Calendar.DATE, a);

      Date date = cal.getTime();
      return date;
  }
}
