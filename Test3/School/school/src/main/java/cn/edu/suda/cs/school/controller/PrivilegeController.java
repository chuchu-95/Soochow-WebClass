package cn.edu.suda.cs.school.controller;

import cn.edu.suda.cs.school.dataObject.User;
import cn.edu.suda.cs.school.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrivilegeController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping(value = "/prv/userlist")
    public List<User> getAllUser(){
        return userServiceImpl.findAll();
    }
}
