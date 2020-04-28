package com.cts.user.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

import com.cts.user.model.User;
import com.cts.user.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	CustomUserDetails customUserDetails;
	User user;
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomUserDetailsService.class);

	public CustomUserDetailsService() {
		super();
	}

	public CustomUserDetailsService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//LOGGER.info("ur name"+username);
		LOGGER.info("loadUserByUsername START");
		Mono<User> us = userRepository.findByUsername(username);
		us.subscribe((user1)->{
			System.out.println(user1);
			user=user1;
		});
		LOGGER.debug(user+"  ur user "+username);
		
		
//		if (user == null)
//			throw new UsernameNotFoundException("username not found");
//		else {
//			user.setUsername("admin");
//			user.setPassword("pwd");
			//LOGGER
			customUserDetails = new CustomUserDetails(us.block());
			LOGGER.debug("reached here"+customUserDetails.getPassword());
	//		}
		LOGGER.info("loadUserByUsername END");
		return customUserDetails;
	}


	

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Override
//	public UserDetails loadUserByUsername(String username)
//			throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public List<User> getUser() {
//		return userRepository.findAll();
//	}
//
//	public User getUserById(int userId) {
//		return userRepository.findById(userId);
//	}
}
