package com.example.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Document(collection = "Questions")
public class Question {

    @Id
    private Long _id;
    private String question;
    private Long quizId;
}
