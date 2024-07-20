package org.example.quorabackendspring.entites;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;

@Document(collection = "questions")
@Data
@Builder
public class Question {

    @MongoId
    private ObjectId mongoId;

    @Indexed(unique = true)
    private Long id;

    private String title;

    private String body;

    @DBRef
    private User author;

    private List<String> topics;

    @DBRef
    private List<Answer> answerList;

    @DBRef
    private List<User> likes;

    private Date createdAt;

    private Date updatedAt;
}
