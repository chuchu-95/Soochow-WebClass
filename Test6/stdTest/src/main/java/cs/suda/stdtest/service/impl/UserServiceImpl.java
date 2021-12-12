package cs.suda.stdtest.service.impl;

import cs.suda.stdtest.entity.User;
import cs.suda.stdtest.repository.UserRepository;
import cs.suda.stdtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-12-01
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    /*@Override
    public User getUser(String name, String password) {
        return userRepository.getByNameAndPassword(name, password);
    }*/

    @Override
    public List<User> showAll() {
        return userRepository.findAll();
    }
}
