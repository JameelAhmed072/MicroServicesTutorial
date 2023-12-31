package com.example.Controller;


import com.example.Model.Quiz;
import com.example.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")

public class QuizController {


    @Autowired
    private QuizService quizService;


    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    //   Get By Id
    @GetMapping("/{id}")
    public Quiz getById(@PathVariable Long id){
        return quizService.get(id);
    }
}
