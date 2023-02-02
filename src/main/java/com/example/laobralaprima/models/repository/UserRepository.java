package com.example.laobralaprima.models.repository;

import com.example.laobralaprima.models.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findUserByFirstName(String firstName);
}
