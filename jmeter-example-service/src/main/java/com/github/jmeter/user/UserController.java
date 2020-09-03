package com.github.jmeter.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

	private final UserService service;

	@PostMapping
	public void createUser(@RequestBody final UserDto userDto) {
		this.service.saveUser(userDto.toModel());
	}
}