package com.qphone.controller;

import com.qphone.pojo.UserBean;
import com.qphone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2019/6/5.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/reg")
    public String getreg(UserBean user) {
        List<String> listname = userService.selectname();
        if (!listname.contains(user.getUname())) {
            userService.insertreg(user);
            return "login";
        }
        return "reg";

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String getlogin(UserBean us, HttpServletRequest request) {
        UserBean user = userService.selectbyname(us.getUname());
        if (user != null) {
            if (user.getUpass().equals(us.getUpass())) {
                if (user.getUtype().equals(us.getUtype())) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    return "redirect:/col/index";
                }
            }
        }
        return "login";
    }
}
