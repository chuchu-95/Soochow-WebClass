package cs.suda.stdtest.controller;

import cs.suda.stdtest.entity.User;
import cs.suda.stdtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-12-01
 **/

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    /*@RequestMapping({"/login"})
    public String login(){
        return "index";
    }
    @RequestMapping("doLogin")
    public String doLogin(User user){
        User user1 = userService.getUser(user.getName(),user.getPassword());
        if(user1 == null){
            return "success";
        }else{
            return "fail";
        }
    }*/

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.showAll();
    }
}
