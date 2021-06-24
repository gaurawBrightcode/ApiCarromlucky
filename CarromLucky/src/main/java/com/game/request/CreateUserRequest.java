package com.game.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateUserRequest {
	
	private long id;
	
	private String first_name;
	
	private String last_name;
	
	private String user_image;
	
	private String email;
	
	private String address;
	
	private long mobile;
}
