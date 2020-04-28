package com.cts.events.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.events.model.Summary;

import reactor.core.publisher.Mono;

@Repository
public interface SummaryRepository extends ReactiveCrudRepository<Summary, String>{

	@Query(value = "select * from summary s where s.event_id = :eventId")
	public Mono<Summary> findByEventId(String eventId);
}
