package com.cts.feedback.api;

import com.cts.feedback.model.FeedBackQuestions;
import com.cts.feedback.repository.FeedBackQuestionRepository;
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
public class QuestionApiController implements QuestionApi {

	@Autowired
	FeedBackQuestionRepository feedBackQuestionRepository;
	
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QuestionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Flux<ResponseEntity<FeedBackQuestions>> questionAllGet() {
    	Flux<FeedBackQuestions> allQuestions = this.feedBackQuestionRepository.findAll();
    	return allQuestions.map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<FeedBackQuestions>> questionQuesIdGet(@PathVariable("quesId") Integer quesId) {
    	Mono<FeedBackQuestions> question = this.feedBackQuestionRepository.findById(quesId);
    	return question.map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<FeedBackQuestions>> addQuestion(FeedBackQuestions feedBackQuestions) {
    	return this.feedBackQuestionRepository.save(feedBackQuestions).map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<FeedBackQuestions>> editQuestion(@RequestBody FeedBackQuestions feedBackQuestion,@PathVariable Integer quesId) {
    	return this.feedBackQuestionRepository.findById(quesId)
    			.flatMap(newQues -> {
    				newQues.setQuestion(feedBackQuestion.getQuestion());
    				newQues.setFeedbackType(feedBackQuestion.getFeedbackType());
    				return feedBackQuestionRepository.save(newQues);
    			}).map(info -> ResponseEntity.ok(info));
    }

}
