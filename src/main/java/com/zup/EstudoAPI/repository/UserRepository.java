package com.zup.EstudoAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zup.EstudoAPI.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
