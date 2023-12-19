package com.example.Repository;

import com.example.Model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuizRepo extends MongoRepository<Quiz,Long> {
}
