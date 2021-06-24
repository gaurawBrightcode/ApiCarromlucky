package com.game.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.game.request.CreateUserRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private long id;
   
   @Column(name = "first_name")
   private String first_name;
   
   @Column(name = "last_name")
   private String last_name;
   
   @Column(name = "user_image")
   private String user_image;
   
   @Column(name = "email")
   private String email;
   
   @Column(name = "address")
   private String address;
   
   @Column(name = "mobile")
   private long mobile;
   
   
   public User(CreateUserRequest createUserRequest) {
		this.id=createUserRequest.getId();
		this.first_name=createUserRequest.getFirst_name();
		this.last_name=createUserRequest.getLast_name();
		this.user_image=createUserRequest.getUser_image();
		this.email=createUserRequest.getEmail();
		this.address=createUserRequest.getAddress();
		this.mobile=createUserRequest.getMobile();
   }

   
}

