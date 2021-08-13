package com.db.microservices.Api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.db.microservices.Repo.UserRepo;
import com.db.microservices.model.User;


@RestController
@RequestMapping(value="")
public class UserAPI {

	@Autowired
	private UserRepo repo;

	@PostMapping
	public @ResponseBody User createUser(@RequestBody User user) {
		repo.save(user);
		return user;
	}

	@GetMapping(value = "/{id}")
	public @ResponseBody User createUser(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
	@GetMapping(value = "/")
	public @ResponseBody List<User> createUser() {
		return repo.findAll();
	}

}
