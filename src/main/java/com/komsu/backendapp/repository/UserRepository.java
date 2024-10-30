package com.komsu.backendapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.komsu.backendapp.model.User;

public interface UserRepository extends MongoRepository<User, Long> {

}