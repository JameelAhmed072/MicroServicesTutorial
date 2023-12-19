package com.example.Service;

import com.example.Model.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@FeignClient(url = "http://localhost:9091", value = "QuestionClient")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {


    @GetMapping("/question/quiz/{id}")
    List<Question> getQuestionOfQuiz(@PathVariable Long id);

}
