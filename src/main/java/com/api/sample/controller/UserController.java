package com.api.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.sample.model.User;
import com.api.sample.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> getAll() {
		return userService.getAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<User> get(@PathVariable("id") final String id) {
		return userService.getAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody final User user) {
		return userService.save(user);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> getByFirstName(@RequestParam("type") final String type,
			@RequestParam("value") final String value) {
		if (!StringUtils.isEmpty(type)) {
			if ("firstName".equalsIgnoreCase(type)) {
				return userService.findUsersByFirstName(value);
			}
			return userService.findUsersByLastName(value);
		}
		return null;
	}

	@RequestMapping(value = "/age", method = RequestMethod.GET)
	public List<User> getByAge(@RequestParam("ageGT") final int ageGT, @RequestParam("ageLT") final int ageLT) {
		return userService.findUsersByAgeBetween(ageGT, ageLT);
	}
}