package cn.edu.suda.cs.school.service.impl;

import cn.edu.suda.cs.school.dataObject.User;
import cn.edu.suda.cs.school.enums.ResultEnum;
import cn.edu.suda.cs.school.exception.UserException;
import cn.edu.suda.cs.school.repository.UserRepository;
import cn.edu.suda.cs.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User findOne(Integer id){
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public void save(User user){
        userRepository.save(user);
    }

    @Override
    public void userDelete(Integer id){
        userRepository.deleteById(id);
    }

    @Override
    public List<User> userListByAge(Integer age){
        return userRepository.findByAge(age);
    }


    @Override
    @Transactional(rollbackOn = Exception.class)
    public void addTwoUser() {
        User userA = new User();
        userA.setAge(30);
        userA.setName("ChuChu");
        save(userA);


        User userB = new User();
        userB.setAge(30);
        userB.setName("Wu");
        save(userB);
    }

    @Override
    public void getStatus(Integer id) throws Exception {
        User user = findOne(id);
        Integer age = user.getAge();
        if (age < 30){
            //energy
            throw new UserException(ResultEnum.ENERGY);
        }else if(age >= 30 && age < 40){
            //positive
            throw new UserException(ResultEnum.HARD_WORK);
        }
    }
}
