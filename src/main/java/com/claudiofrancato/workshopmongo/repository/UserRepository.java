package com.claudiofrancato.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.claudiofrancato.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
