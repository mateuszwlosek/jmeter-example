package com.github.jmeter.user;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@Document("user")
public class User {

	@Id
	private String id;
	private String username;
	private String email;
	private String city;
	private Instant age;
}
