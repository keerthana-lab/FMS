package com.cts.events.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.cts.events.model.Summary;
import com.cts.events.repository.SummaryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

@Controller
public class SummaryApiController implements SummaryApi {

	@Autowired
	public SummaryRepository summaryRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SummaryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Flux<ResponseEntity<Summary>> summaryAllGet() {
    	Flux<Summary> summary = this.summaryRepository.findAll();
		return summary.map(info -> ResponseEntity.ok(info));
    }

}
