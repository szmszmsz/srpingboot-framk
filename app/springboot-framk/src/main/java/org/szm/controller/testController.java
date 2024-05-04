package org.szm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.szm.service.UserService;

@RestController
@RequestMapping("/test")
public class testController {

    @Autowired
    private UserService userService;

    @GetMapping("/getTest")
    public String test(){
        userService.getPerson();

        return "请求成功";
    }
}
