package com.cts.feedback.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;


/**
 * FeedBackAnswers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-27T11:08:48.981+05:30")

public class FeedBackAnswers   {
	
	@Id
  @JsonProperty("ansId")
  private Integer ansId = null;

  @JsonProperty("quesId")
  private Integer quesId = null;
  
  @JsonProperty("question")
  private String question = null;

  @JsonProperty("answer")
  private String answer = null;

  @JsonProperty("userId")
  private Integer userId = null;

  public FeedBackAnswers ansId(Integer ansId) {
    this.ansId = ansId;
    return this;
  }

  /**
   * Get ansId
   * @return ansId
  **/
  @ApiModelProperty(value = "")


  public Integer getAnsId() {
    return ansId;
  }

  public void setAnsId(Integer ansId) {
    this.ansId = ansId;
  }

  public String getQuestion() {
	return question;
}

public void setQuestion(String question) {
	this.question = question;
}

public FeedBackAnswers quesId(Integer quesId) {
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

  public FeedBackAnswers answer(String answer) {
    this.answer = answer;
    return this;
  }

  /**
   * Get answer
   * @return answer
  **/
  @ApiModelProperty(value = "")


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public FeedBackAnswers userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FeedBackAnswers other = (FeedBackAnswers) obj;
	if (ansId == null) {
		if (other.ansId != null)
			return false;
	} else if (!ansId.equals(other.ansId))
		return false;
	if (answer == null) {
		if (other.answer != null)
			return false;
	} else if (!answer.equals(other.answer))
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
	if (userId == null) {
		if (other.userId != null)
			return false;
	} else if (!userId.equals(other.userId))
		return false;
	return true;
}

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ansId == null) ? 0 : ansId.hashCode());
	result = prime * result + ((answer == null) ? 0 : answer.hashCode());
	result = prime * result + ((quesId == null) ? 0 : quesId.hashCode());
	result = prime * result + ((question == null) ? 0 : question.hashCode());
	result = prime * result + ((userId == null) ? 0 : userId.hashCode());
	return result;
}

  @Override
public String toString() {
	return "FeedBackAnswers [ansId=" + ansId + ", quesId=" + quesId
			+ ", question=" + question + ", answer=" + answer + ", userId="
			+ userId + "]";
}

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
//  private String toIndentedString(java.lang.Object o) {
//    if (o == null) {
//      return "null";
//    }
//    return o.toString().replace("\n", "\n    ");
//  }
}

