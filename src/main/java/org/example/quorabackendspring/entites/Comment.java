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

@Document(collection = "comments")
@Data
@Builder
public class Comment {
    @MongoId
    private ObjectId mongoId;

    @Indexed(unique = true)
    private Long id;

    private String text;

    @DBRef
    private User author;

    @DBRef
    private List<Comment> commentList;

    @DBRef
    private Comment parentComment;

    @DBRef
    private Answer parentAnswer;

    @DBRef
    private List<User> likes;

    private Date createdAt;

    private Date updatedAt;
}
