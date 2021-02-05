package com.aerotop.ssosubsysa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: SubSystemA
 * @Description: TODO
 * @Author: gaosong
 * @Date 2021/2/4 14:20
 */
@Controller
public class SubSystemA {
    @RequestMapping("/test")
    public String test(HttpServletRequest request, Model model) {
        return "test";
    }
    @RequestMapping("/success")
    public String success(HttpServletRequest request, Model model) {
        return "success";
    }
}
