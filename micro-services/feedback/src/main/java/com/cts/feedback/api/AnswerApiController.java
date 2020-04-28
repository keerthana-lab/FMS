package com.cts.feedback.api;

import com.cts.feedback.model.FeedBackAnswers;
import com.cts.feedback.repository.FeedBackAnswerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-27T11:08:48.981+05:30")

@Controller
public class AnswerApiController implements AnswerApi {

	@Autowired
	private FeedBackAnswerRepository feedBackAnswerRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AnswerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Flux<ResponseEntity<FeedBackAnswers>> answerAllGet() {
    	Flux<FeedBackAnswers> allAnswers = this.feedBackAnswerRepository.findAll();
    	return allAnswers.map(info -> ResponseEntity.ok(info));
    }

    @Override
    public Flux<ResponseEntity<FeedBackAnswers>> answerIdGet(@PathVariable("id") Integer id) {
    	Flux<FeedBackAnswers> answersById = this.feedBackAnswerRepository.findByQuesId(id);
    	return answersById.map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<FeedBackAnswers>> addAnswer(@RequestBody FeedBackAnswers answer){
    	return this.feedBackAnswerRepository.save(answer).map(info -> ResponseEntity.ok(info));
    }
}
