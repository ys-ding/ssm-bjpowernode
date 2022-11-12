package com.bjpowernode.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /*
        理论上给Controller分配url应该写：http://localhost:8080/crm/
        为了简便，协议://ip:port/应用名称必须省去，用/代替
     */
    @RequestMapping("/")
    public String index(){
        //请求转发
        return "index";
    }
}
