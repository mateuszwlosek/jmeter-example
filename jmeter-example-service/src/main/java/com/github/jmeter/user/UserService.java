package com.github.jmeter.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository repository;

	public void saveUser(final User user) {
		User entity = repository.save(user);
		log.info("Saved user: {}", entity);
	}
}
