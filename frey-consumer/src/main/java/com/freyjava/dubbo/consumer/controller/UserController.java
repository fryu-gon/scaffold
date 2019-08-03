package com.freyjava.dubbo.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.freyjava.dubbo.api.user.UserApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
     @Reference
     private UserApi userApi;

}
