package com.cts.events.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.events.model.Summary;
import com.cts.events.repository.SummaryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

@Controller
public class SummaryIdApiController implements SummaryIdApi {

	@Autowired
	public SummaryRepository summaryRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SummaryIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Mono<ResponseEntity<Summary>> summaryIdSummaryIdGet(@PathVariable("eventId") String eventId) {
    	Mono<Summary> summary = this.summaryRepository.findByEventId(eventId);
		return summary.map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<Summary>> addNewSummary(@RequestBody Summary summary) {
    	return this.summaryRepository.save(summary).map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<Summary>> updateSummary(@RequestBody Summary summary) {    	
    	return this.summaryRepository.findByEventId(summary.getEventId())
    			.flatMap(newSummary -> {
    				newSummary.setMonth(summary.getMonth());
    				newSummary.setBaseLocation(summary.getBaseLocation());
    				newSummary.setBeneficiaryName(summary.getBeneficiaryName());
    				newSummary.setVenueAddress(summary.getVenueAddress());
    				newSummary.setCouncilName(summary.getCouncilName());
    				newSummary.setProject(summary.getProject());
    				newSummary.setCategory(summary.getCategory());
    				newSummary.setEventName(summary.getEventName());
    				newSummary.setEventDescription(summary.getEventDescription());
    				newSummary.setEventDate(summary.getEventDate());
    				newSummary.setTotalVolunteers(summary.getTotalVolunteers());
    				newSummary.setTotalVolunteerHours(summary.getTotalVolunteerHours());
    				newSummary.setTotalTravelHours(summary.getTotalTravelHours());
    				newSummary.setOverallHours(summary.getOverallHours());
    				newSummary.setLivesImpacted(summary.getLivesImpacted());
    				newSummary.setActivityType(summary.getActivityType());
    				newSummary.setStatus(summary.getStatus());
    				newSummary.setPocId(summary.getPocId());
    				newSummary.setPocName(summary.getPocName());
    				newSummary.setPocContact(summary.getPocContact());
    			return this.summaryRepository.save(newSummary);
    			}).map(info -> ResponseEntity.ok(info));
    	
    }
  }

