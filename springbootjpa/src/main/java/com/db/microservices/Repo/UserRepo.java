package com.db.microservices.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.microservices.model.User;


public interface UserRepo extends JpaRepository<User, Integer> {

}
