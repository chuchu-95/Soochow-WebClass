package cs.suda.stdtest.service;

import cs.suda.stdtest.entity.Question;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-11-26
 **/

@Service
public interface QuestionService {
    List<Question> showAllQues();
    List<Question> findByDifficulty(String difficulty);
    List<Question> generateQuestion(int questionCountPerLevel);
    void save(Question question);
    void deleteQuestion(int id);
}
