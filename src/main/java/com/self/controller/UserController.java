package com.self.controller;

import com.self.domain.User;
import com.self.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findUser1")
    @ResponseBody
    public List<User> findUser(){

        List<User> user = userMapper.findUserByName();
        return user;
    }

   /* @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(ServletRequest request){

        User user = new User();
        user.setUsername("锂离子");
        user.setPassword("456");
        userMapper.addUser(user);

        return "add success";
    }*/


    @RequestMapping("/findUser")
    @ResponseBody
    public List<User> finUser(){

        return userMapper.findUser();
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String  addUser(){
        User user = new User();
        user.setUsername("六一");

        user.setPassword("567");
        userMapper.addUser(user);

        return "add success";
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(){

        int id = 1;
        userMapper.updateUser(id);

        return "update success";
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(){

        int id = 3;
        userMapper.deleteUser(id);

        return "delete success";
    }

 }
