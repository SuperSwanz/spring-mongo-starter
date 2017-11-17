package com.api.sample.service;

import java.util.List;

import com.api.sample.model.User;

public interface UserService {
	public List<User> getAll();

	public User get(final String id);

	public User save(final User user);
}
