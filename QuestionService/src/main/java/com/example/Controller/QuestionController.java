package com.example.Controller;

import com.example.Model.Question;
import com.example.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    // create Question
    @PostMapping
    public Question createQuestion(@RequestBody Question question){
        return this.questionService.create(question);
    }

    // get All Questions
    @GetMapping
    public List<Question> getAllQuestions(){
        return this.questionService.getAll();
    }
    // get Question By Id
    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id){
        return this.questionService.getById(id);
    }

    //  get all questions of specific quizId
    @GetMapping("/quiz/{id}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long id){
        return this.questionService.getQuestionsOfQuiz(id);
    }



}
