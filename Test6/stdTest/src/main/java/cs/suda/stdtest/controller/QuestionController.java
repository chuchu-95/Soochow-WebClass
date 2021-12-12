package cs.suda.stdtest.controller;

import cs.suda.stdtest.entity.Question;
import cs.suda.stdtest.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: stdTest
 * @description:
 * @author: ChuChu
 * @create: 2021-11-26
 **/
@CrossOrigin("*")
@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> showQuestions(){
        return questionService.showAllQues();
    }

    @GetMapping("/ks/{id}")
    public List<Question> getQuestions(@PathVariable("ct") Integer ct) {
        return questionService.generateQuestion(ct);
    }

    @GetMapping("/d/{difficulty}")
    public List<Question> getQuestions(@PathVariable("difficulty") String difficulty){
        return questionService.findByDifficulty(difficulty);
    }

    @PostMapping("/save")
    public void save(@RequestBody Question question){
        questionService.save(question);
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable("id") Integer id){
        questionService.deleteQuestion(id);
    }
}
