package cn.edu.suda.cs.school.dataObject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.Min;

@Data
@Entity
public class User {
    @GeneratedValue
    @Id
    private Integer id;
    private String name;

    @Min(value = 18, message = "Only when age is larger than 18 can user registers")
    private Integer age;

}
