package com.github.jmeter.user;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class UserDto {

	private String username;
	private String email;
	private String city;
	private Instant age;

	public User toModel() {
		return User.builder()
			.username(username)
			.email(email)
			.city(city)
			.age(age)
			.build();
	}
}
