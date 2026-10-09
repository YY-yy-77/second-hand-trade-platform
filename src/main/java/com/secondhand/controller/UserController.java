package com.secondhand.controller;
import com.secondhand.entity.User;//导入实体，用来接收前端传来的用户信息
import com.secondhand.service.UserService;//导入业务层，Contaoller不直接操作数据库，交给Service
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
@RestController//表示这是控制器，返回JSON数据给前端
@RequestMapping("/user")//给控制器统一的前缀，所有接口地址前面都带上/user

public class UserController {
    @Resource
    private UserService userService;//声明一个service用来调用业务方法
    @PostMapping("/register")//接口地址/user/register，Post Mapping用来新增数据
    public User register(@RequestBody User user){//接收前端传过来的JSON数据，自动转换为User对象
        return userService.saveUser(user);//调用Service的保存功能，把用户存入数据库，在转成JSON返回给前端
    }
}
