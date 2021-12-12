package cn.edu.suda.cs.school.controller;

import cn.edu.suda.cs.school.dataObject.Result;
import cn.edu.suda.cs.school.dataObject.User;
import cn.edu.suda.cs.school.service.UserService;
import cn.edu.suda.cs.school.utilities.ResultUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/users")
    public List<User> userList(){

        return userService.findAll();
    }


    @PostMapping(value = "/users")
    public Result<User> userAdd(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtility.error(100, bindingResult.getFieldError().getDefaultMessage());
        }

        userService.save(user);
        return ResultUtility.success(user);
    }


    @GetMapping(value = "/users/{id}")
    public User userFindOne(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }


    @GetMapping(value = "/users/{id}")
    public User userUpdate(@PathVariable("id") Integer id,
                           @RequestParam("name")String name,
                           @RequestParam("age")Integer myAge){
        User user = new User();
        user.setId(id);
        user.setName(name);



        user.setAge(myAge);
        userService.save(user);
        return user;
    }

    @GetMapping(value = "/users/addTwo")
    public void addTwoUser(){
        userService.addTwoUser();
    }

    @GetMapping(value = "/users/status/{id}")
    public void getStatus(@PathVariable("id") Integer id) throws Exception{
        userService.getStatus(id);
    }
}
