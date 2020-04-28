package com.cts.feedback.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.feedback.model.FeedBackQuestions;

@Repository
public interface FeedBackQuestionRepository extends ReactiveCrudRepository<FeedBackQuestions, Integer> {

}
