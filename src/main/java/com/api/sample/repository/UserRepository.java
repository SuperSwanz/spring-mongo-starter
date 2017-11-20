package com.api.sample.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.sample.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	@Query("{ 'firstName' : ?0 }")
	public List<User> findUsersByFirstName(final String firstName);
	
	public List<User> findUsersByLastName(final String lastName);
}