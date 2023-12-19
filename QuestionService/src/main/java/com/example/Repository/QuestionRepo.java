package com.example.Repository;

import com.example.Model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepo extends MongoRepository<Question,Long> {

    List<Question> findByQuizId(Long quizId);
}
