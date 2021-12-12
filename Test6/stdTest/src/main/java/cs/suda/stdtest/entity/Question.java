package cs.suda.stdtest.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-11-26
 **/

@Entity
@Data
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) //increase itself
    private int id;
    private String title;
    private String answer;
    private String difficulty;
    //private Date createTime;
    private String createTime;
}
