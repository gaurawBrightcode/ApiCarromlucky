package com.game.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.game.entity.User;
import com.game.request.CreateUserRequest;
import com.game.response.UserResponse;
import com.game.service.UserService;

@RestController
@RequestMapping("/api/user/")
public class UserController {
 
	@Autowired	
	UserService userService;
	
  @GetMapping("/getAllUsers")
  public List<UserResponse> getAllUsers() {
	  List<User> userList = userService.getAllUsers();
	  List<UserResponse> userResponsesList = new ArrayList<UserResponse>();
	  userList.stream().forEach(user -> {
		  userResponsesList.add(new UserResponse(user));
	  });
	  return userResponsesList;
  }
  
  @PostMapping("create")
  public UserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
	User user = userService.createUser(createUserRequest);
	return new UserResponse(user);
  }
  
}
