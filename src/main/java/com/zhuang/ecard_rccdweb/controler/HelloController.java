package com.zhuang.ecard_rccdweb.controler;

import com.zhuang.ecard_common.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String doHello(){
        User user = new User();
        return "hello";
    }
}
