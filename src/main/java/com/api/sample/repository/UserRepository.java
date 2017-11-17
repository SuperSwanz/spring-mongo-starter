package com.api.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.api.sample.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
