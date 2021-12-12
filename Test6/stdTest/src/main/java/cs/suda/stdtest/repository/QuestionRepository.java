package cs.suda.stdtest.repository;

import cs.suda.stdtest.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-11-26
 **/

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findQuestionByDifficultyEquals(String difficulty);
    List<Question> findAll();
}
