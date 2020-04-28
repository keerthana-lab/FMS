/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.cts.feedback.api;

import com.cts.feedback.model.FeedBackQuestions;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-27T11:08:48.981+05:30")

@Api(value = "question", description = "the question API")
public interface QuestionApi {

    Logger log = LoggerFactory.getLogger(QuestionApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "questionAllGet", notes = "get all questions", response = FeedBackQuestions.class, tags={ "Dashboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "fetch", response = FeedBackQuestions.class),
        @ApiResponse(code = 404, message = "No DataFound") })
    @RequestMapping(value = "/question/all",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Flux<ResponseEntity<FeedBackQuestions>> questionAllGet() {
//        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
//            if (getAcceptHeader().get().contains("application/json")) {
//                try {
//                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"question\" : \"question\",  \"quesId\" : 0}", FeedBackQuestions.class), HttpStatus.NOT_IMPLEMENTED);
//                } catch (IOException e) {
//                    log.error("Couldn't serialize response for content type application/json", e);
//                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//                }
//            }
//        } else {
//            log.warn("ObjectMapper or HttpServletRequest not configured in default QuestionApi interface so no example is generated");
//        }
        return Flux.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }


    @ApiOperation(value = "", nickname = "questionQuesIdGet", notes = "get question by id", response = FeedBackQuestions.class, tags={ "Dashboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "fetch", response = FeedBackQuestions.class),
        @ApiResponse(code = 404, message = "No DataFound") })
    @RequestMapping(value = "/question/{quesId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Mono<ResponseEntity<FeedBackQuestions>> questionQuesIdGet(@ApiParam(value = "",required=true) @PathVariable("quesId") Integer quesId) {
//        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
//            if (getAcceptHeader().get().contains("application/json")) {
//                try {
//                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"question\" : \"question\",  \"quesId\" : 0}", FeedBackQuestions.class), HttpStatus.NOT_IMPLEMENTED);
//                } catch (IOException e) {
//                    log.error("Couldn't serialize response for content type application/json", e);
//                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//                }
//            }
//        } else {
//            log.warn("ObjectMapper or HttpServletRequest not configured in default QuestionApi interface so no example is generated");
//        }
        return Mono.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }

    @PostMapping("/addQues")
    default Mono<ResponseEntity<FeedBackQuestions>> addQuestion(@RequestBody FeedBackQuestions feedBackQuestions) {
    	return Mono.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }
    
    @PutMapping("/editQues/{quesId}")
    default Mono<ResponseEntity<FeedBackQuestions>> editQuestion(@RequestBody FeedBackQuestions feedBackQuestion,@PathVariable Integer quesId) {
    	return Mono.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }
}