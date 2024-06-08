package org.szm.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.szm.entity.User;
import org.szm.globle.Response;
import org.szm.service.UserService;

@RestController
@RequestMapping("/test")
public class testController {

    private static final Logger log = LoggerFactory.getLogger(testController.class);
    @Autowired
    private UserService userService;

    @GetMapping("/getTest")
    public String test(){
        userService.getPerson();

        return "请求成功";
    }

    @PostMapping("/run")
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 401, message = "没有访问权限"),
            @ApiResponse(code = 403, message = "资源不可用"),
            @ApiResponse(code = 404, message = "地址输入有误"),
    })
    public Response<User> runByProcessId()  {
        User user = new User(1, "小明","12");
        return  new Response<>(Response.FAILURE_CODE,"查询成功",user);
    }
}
