package com.example.Service;

import com.example.Model.Quiz;
import com.example.Repository.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepo quizRepo;

    @Autowired
    private QuestionClient questionClient;


    public Quiz add(Quiz quiz) {
        return this.quizRepo.save(quiz);
    }

    public List<Quiz> get() {
        List<Quiz> quizzes = this.quizRepo.findAll();

        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
            quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.get_id()));

            return quiz;
        }).collect(Collectors.toList());

        return newQuizList;
    }
    public Quiz get(Long id) {
        Quiz quiz = this.quizRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Quiz Not found"));

        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.get_id()));
        return quiz;
    }

}
