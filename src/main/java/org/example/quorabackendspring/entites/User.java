package org.example.quorabackendspring.entites;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Date;
import java.util.List;

@Document(collection = "users")
@Data
@Builder
public class User {

    @MongoId
    private ObjectId mongoId;

    @Indexed(unique = true)
    private Long id;

    @Indexed(unique = true)
    private String username;

    private String password;

    private String bio;

    @DBRef
    private List<User> followers;

    @DBRef
    private List<User> follow;

    @DBRef
    private List<Question> questionList;

    @DBRef
    private List<Answer> answerList;

    private Date createdAt;

    private Date updatedAt;

}
