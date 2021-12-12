package cs.suda.stdtest.repository;

import cs.suda.stdtest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-12-01
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    //User getByNameAndPassword(String name, String password);
    List<User> findAll();
}
