package org.example.quorabackendspring.repositories;

import org.example.quorabackendspring.entites.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {

}
