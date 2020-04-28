package com.cts.events.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.events.model.Event;
import com.cts.events.repository.EventRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

@RestController
public class EventIdApiController implements EventIdApi {
	
	@Autowired
	public EventRepository eventRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EventIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Mono<ResponseEntity<Event>> eventIdEventIdGet(@PathVariable("eventId") String eventId) {
    	Mono<Event> event = this.eventRepository.findByEventId(eventId);
		return event.map(info -> ResponseEntity.ok(info));
    }
    
    @Override
	public Mono<ResponseEntity<Event>> addNewEvent(@RequestBody Event event) {
    	return this.eventRepository.save(event).map(info -> ResponseEntity.ok(info));
    }
    
    @Override
	public Mono<ResponseEntity<Event>> updateEvent(@RequestBody Event event) {
    	String id = event.getEventId();
    	return this.eventRepository.findByEventId(id)
    			.flatMap(newEvent -> {
    				newEvent.setBaseLocation(event.getBaseLocation());
    				newEvent.setBeneficiaryName(event.getBeneficiaryName());
    				newEvent.setCouncilName(event.getCouncilName());
    				newEvent.setEventName(event.getEventName());
    				newEvent.setEventDescription(event.getEventDescription());
    				newEvent.setEventDate(event.getEventDate());
    				newEvent.setEmpId(event.getEmpId());
    				newEvent.setEmpName(event.getEmpName());
    				newEvent.setVolunteerHours(event.getVolunteerHours());
    				newEvent.setTravelHours(event.getTravelHours());
    				newEvent.setLivesImpacted(event.getLivesImpacted());
    				newEvent.setBusinessUnit(event.getBusinessUnit());
    				newEvent.setStatus(event.getStatus());
    				newEvent.setIiepCategory(event.getIiepCategory());
    				newEvent.setSummaryId(event.getSummaryId());
    				return this.eventRepository.save(newEvent);
    			}).map(info -> ResponseEntity.ok(info));
    }

}
