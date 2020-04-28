package com.cts.events.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Mono;

import com.cts.events.model.Dashboard;

@Repository
public interface DashboardRepository extends ReactiveCrudRepository<Dashboard, Long> {

	@Query(value = "select count(*) from summary s")
	public Mono<Long> findTotalEvents();
	
	@Query(value = "select sum(e.lives_impacted) from event e")
	public Mono<Long> findLivesImpacted();
	
	@Query(value = "select sum(s.total_volunteers) from summary s")
	public Mono<Long> findTotalVolunteers();
}
