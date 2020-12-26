package com.techprimers.mongo.springbootmongodbexample.repository;

import com.techprimers.mongo.springbootmongodbexample.document.Users;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
    Users findByName(String name);
}
