package com.cts.user.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

import com.cts.user.model.User;


@Repository
public interface UserRepository extends ReactiveCrudRepository<User, Integer>{

	@Query("select * from user where username=:username")
	public	Mono<User> findByUsername(String username);
	
}

