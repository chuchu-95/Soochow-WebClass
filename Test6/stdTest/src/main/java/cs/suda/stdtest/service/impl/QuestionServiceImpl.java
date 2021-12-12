package cs.suda.stdtest.service.impl;

import cs.suda.stdtest.entity.Question;
import cs.suda.stdtest.repository.QuestionRepository;
import cs.suda.stdtest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-11-26
 **/

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> showAllQues() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> findByDifficulty(String difficulty) {
        return questionRepository.findQuestionByDifficultyEquals(difficulty);
    }

    @Override
    public List<Question> generateQuestion(int questionCountPerLevel) {
        //just return 1, 2 difficulty questions, defined by questionCountPerLevel
        List<Question> returnQuestions = new ArrayList<>();

        List<Question> allQuestion = questionRepository.findAll();

        //get level 1,num=2 question
        List<Question> levelOne = allQuestion.stream().filter(
                q->q.getDifficulty().equals('1')
        ).limit(questionCountPerLevel).collect(Collectors.toList());

        List<Question> levelTwo = allQuestion.stream().filter(
                q->q.getDifficulty().equals("2")
        ).limit(questionCountPerLevel).collect(Collectors.toList());

        returnQuestions.addAll(levelOne);
        returnQuestions.addAll(levelTwo);

        return returnQuestions;
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void deleteQuestion(int id) {
        if (questionRepository.existsById(id)){
            questionRepository.deleteById(id);
        }
    }
}
