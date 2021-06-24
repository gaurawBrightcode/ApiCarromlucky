package com.game.response;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.game.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserResponse {
   @JsonIgnore
   private long id;
   
   private String first_name;
   
   private String last_name;
   
   private String user_image;
   
   private String email;
   
   private String address;
   
   private long mobile;
   
   public UserResponse(User user) {
	// TODO Auto-generated constructor stub
	   this.id=user.getId();
	   this.first_name=user.getFirst_name();
	   this.last_name = user.getLast_name();
	   this.user_image=user.getUser_image();
	   this.email=user.getEmail();
	   this.address=user.getAddress();
	   this.mobile=user.getMobile();
}
   
}
