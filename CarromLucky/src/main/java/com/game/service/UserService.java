package com.game.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.entity.User;
import com.game.repository.UserRepository;
import com.game.request.CreateUserRequest;

 

@Service
public class UserService {
	
@Autowired	
UserRepository userRepository;

public List<User> getAllUsers() {
	
   return userRepository.findAll();
}

public User createUser(CreateUserRequest createUserRequest) {
	User user = new User(createUserRequest);
	user = userRepository.save(user);
    return user;	
}
}
