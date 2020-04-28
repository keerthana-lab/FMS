package com.cts.feedback.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;


/**
 * FeedBackQuestions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-27T11:08:48.981+05:30")

public class FeedBackQuestions   {
	
	@Id
  @JsonProperty("quesId")
  private Integer quesId = null;

  @JsonProperty("question")
  private String question = null;
  
  @JsonProperty("feedbackType")
  private String feedbackType = null;

  public FeedBackQuestions quesId(Integer quesId) {
    this.quesId = quesId;
    return this;
  }

  /**
   * Get quesId
   * @return quesId
  **/
  @ApiModelProperty(value = "")


  public Integer getQuesId() {
    return quesId;
  }

  public void setQuesId(Integer quesId) {
    this.quesId = quesId;
  }

  public FeedBackQuestions question(String question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(value = "")


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  

  public String getFeedbackType() {
	return feedbackType;
}

public void setFeedbackType(String feedbackType) {
	this.feedbackType = feedbackType;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FeedBackQuestions other = (FeedBackQuestions) obj;
	if (feedbackType == null) {
		if (other.feedbackType != null)
			return false;
	} else if (!feedbackType.equals(other.feedbackType))
		return false;
	if (quesId == null) {
		if (other.quesId != null)
			return false;
	} else if (!quesId.equals(other.quesId))
		return false;
	if (question == null) {
		if (other.question != null)
			return false;
	} else if (!question.equals(other.question))
		return false;
	return true;
}

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((feedbackType == null) ? 0 : feedbackType.hashCode());
	result = prime * result + ((quesId == null) ? 0 : quesId.hashCode());
	result = prime * result + ((question == null) ? 0 : question.hashCode());
	return result;
}

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedBackQuestions {\n");
    
    sb.append("    quesId: ").append(toIndentedString(quesId)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    feedbackType: ").append(toIndentedString(feedbackType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

