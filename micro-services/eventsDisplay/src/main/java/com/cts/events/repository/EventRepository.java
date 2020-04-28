package com.cts.events.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


//import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.cts.events.model.Event;

import reactor.core.publisher.Mono;

@Repository
public interface EventRepository extends ReactiveCrudRepository<Event, String>{

	@Query(value = "select * from event e where e.event_id = :eventId")
	public Mono<Event> findByEventId(String eventId);
}
