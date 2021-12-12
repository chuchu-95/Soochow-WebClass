package cs.suda.stdtest.service;

import cs.suda.stdtest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-12-01
 **/

@Service
public interface UserService {
//    public User getUser(String name, String password);
    List<User> showAll();
}
