package cn.edu.suda.cs.school.repository;

import cn.edu.suda.cs.school.dataObject.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findByAge(Integer age);
    //Select * from user where age = ? and name = ?
    public List<User> findByAgeAndName(Integer age, String name);
}
