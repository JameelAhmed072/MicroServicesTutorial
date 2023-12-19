package com.example.Service;

import com.example.Model.Question;
import com.example.Repository.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;
    public Question create(Question question) {
        return this.questionRepo.save(question);
    }

    public List<Question> getAll() {
        return this.questionRepo.findAll();
    }

    public Question getById(Long id) {
        return this.questionRepo.findById(id).orElseThrow(()-> new RuntimeException("Question Not Found"));
    }

    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return this.questionRepo.findByQuizId(quizId);
    }
}
