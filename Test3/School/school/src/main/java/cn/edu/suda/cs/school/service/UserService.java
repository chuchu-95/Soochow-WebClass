package cn.edu.suda.cs.school.service;

import cn.edu.suda.cs.school.dataObject.User;

import java.util.List;

public interface UserService {
    User findOne(Integer id);

    List<User> findAll();

    void save(User user);

    void userDelete(Integer id);

    List<User> userListByAge(Integer age);

    void addTwoUser();

    void getStatus(Integer id) throws Exception;

}
