package com.cts.feedback.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;

import com.cts.feedback.model.FeedBackAnswers;

@Repository
public interface FeedBackAnswerRepository extends ReactiveCrudRepository<FeedBackAnswers, Integer>{

	@Query(value = "select * from feed_back_answers f where f.ques_id = :id")
	public Flux<FeedBackAnswers> findByQuesId(Integer id);
}
