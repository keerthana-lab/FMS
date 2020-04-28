package com.cts.events.api;

import com.cts.events.model.Dashboard;
import com.cts.events.model.Event;
import com.cts.events.repository.DashboardRepository;
import com.cts.events.repository.EventRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

@Controller
public class AllApiController implements AllApi {

	@Autowired
	public EventRepository eventRepository;
	
	@Autowired
	public DashboardRepository dashboardRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AllApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.ofNullable(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    public Flux<ResponseEntity<Event>> allGet() {
    	Flux<Event> events = this.eventRepository.findAll();
		return events.map(info -> ResponseEntity.ok(info));
    }

    @Override
    public Mono<ResponseEntity<Dashboard>> getDashBoardDetails() { 
    	
    	Mono<Long> totalEvent = this.dashboardRepository.findTotalEvents();
    	Mono<Long> totalLivesImpact = this.dashboardRepository.findLivesImpacted();
    	Mono<Long> totalVolunteers = this.dashboardRepository.findTotalVolunteers();
    	
    	Dashboard d = new Dashboard();
    	Mono<Dashboard> dashboard = totalEvent.map(a-> {
    		d.setTotalEvents(a);
    		return d;
    	});   
    	totalLivesImpact.subscribe(a -> {
    		d.setLivesImpacted(a);
    	});
    	totalVolunteers.subscribe(a -> {
    		d.setTotalVolunteers(a);
    		d.setTotalParticipants(a);
    	});
    	
		return dashboard.map(info -> ResponseEntity.ok(info)); 
    }

}
