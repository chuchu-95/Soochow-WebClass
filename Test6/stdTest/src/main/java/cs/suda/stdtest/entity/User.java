package cs.suda.stdtest.entity;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-12-01
 **/
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) //increase itself
    private Integer id;
    private String name;
    private String password;
}
