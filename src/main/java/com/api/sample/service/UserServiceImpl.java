package com.api.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.sample.model.User;
import com.api.sample.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User get(String id) {
		return userRepository.findOne(id);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public List<User> findUsersByFirstName(final String firstName) {
		return userRepository.findUsersByFirstName(firstName);
	}

	@Override
	public List<User> findUsersByLastName(final String lastName) {
		return userRepository.findUsersByLastName(lastName);
	}
}