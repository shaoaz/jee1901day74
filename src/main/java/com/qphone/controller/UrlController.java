package com.qphone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/5/29.
 */
@Controller
public class UrlController {

    @RequestMapping("/{url}")
    public String getUrl1(@PathVariable("url") String url) {

        return url;
    }
    @RequestMapping("/{url}/{url1}")
    public String getUrl2(@PathVariable("url") String url,@PathVariable("url1") String url1) {

        return url1;
    }
}
