package com.cts.events.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Summary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

public class Summary   {
	
 @Id
  @JsonProperty("summaryId")
  private Integer summaryId = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("month")
  private String month = null;

  @JsonProperty("baseLocation")
  private String baseLocation = null;

  @JsonProperty("beneficiaryName")
  private String beneficiaryName = null;

  @JsonProperty("venueAddress")
  private String venueAddress = null;

  @JsonProperty("councilName")
  private String councilName = null;

  @JsonProperty("project")
  private String project = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("eventName")
  private String eventName = null;

  @JsonProperty("eventDescription")
  private String eventDescription = null;

  @JsonProperty("eventDate")
  private Date eventDate = null;

  @JsonProperty("totalVolunteers")
  private Integer totalVolunteers = null;

  @JsonProperty("totalVolunteerHours")
  private Integer totalVolunteerHours = null;

  @JsonProperty("totalTravelHours")
  private Integer totalTravelHours = null;

  @JsonProperty("overallHours")
  private Integer overallHours = null;

  @JsonProperty("livesImpacted")
  private Integer livesImpacted = null;

  @JsonProperty("activityType")
  private String activityType = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("pocId")
  private BigDecimal pocId = null;

  @JsonProperty("pocName")
  private String pocName = null;

  @JsonProperty("pocContact")
  private BigDecimal pocContact = null;

  public Summary summaryId(Integer summaryId) {
    this.summaryId = summaryId;
    return this;
  }

  /**
   * Get summaryId
   * @return summaryId
  **/
  @ApiModelProperty(value = "")


  public Integer getSummaryId() {
    return summaryId;
  }

  public void setSummaryId(Integer summaryId) {
    this.summaryId = summaryId;
  }

  public Summary eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   * @return eventId
  **/
  @ApiModelProperty(value = "")


  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Summary month(String month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")


  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public Summary baseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
    return this;
  }

  /**
   * Get baseLocation
   * @return baseLocation
  **/
  @ApiModelProperty(value = "")


  public String getBaseLocation() {
    return baseLocation;
  }

  public void setBaseLocation(String baseLocation) {
    this.baseLocation = baseLocation;
  }

  public Summary beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  /**
   * Get beneficiaryName
   * @return beneficiaryName
  **/
  @ApiModelProperty(value = "")


  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public Summary venueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
    return this;
  }

  /**
   * Get venueAddress
   * @return venueAddress
  **/
  @ApiModelProperty(value = "")


  public String getVenueAddress() {
    return venueAddress;
  }

  public void setVenueAddress(String venueAddress) {
    this.venueAddress = venueAddress;
  }

  public Summary councilName(String councilName) {
    this.councilName = councilName;
    return this;
  }

  /**
   * Get councilName
   * @return councilName
  **/
  @ApiModelProperty(value = "")


  public String getCouncilName() {
    return councilName;
  }

  public void setCouncilName(String councilName) {
    this.councilName = councilName;
  }

  public Summary project(String project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")


  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public Summary category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Summary eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Get eventName
   * @return eventName
  **/
  @ApiModelProperty(value = "")


  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public Summary eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

  /**
   * Get eventDescription
   * @return eventDescription
  **/
  @ApiModelProperty(value = "")


  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public Summary eventDate(Date eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Date getEventDate() {
    return eventDate;
  }

  public void setEventDate(Date eventDate) {
    this.eventDate = eventDate;
  }

  public Summary totalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
    return this;
  }

  /**
   * Get totalVolunteers
   * @return totalVolunteers
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalVolunteers() {
    return totalVolunteers;
  }

  public void setTotalVolunteers(Integer totalVolunteers) {
    this.totalVolunteers = totalVolunteers;
  }

  public Summary totalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
    return this;
  }

  /**
   * Get totalVolunteerHours
   * @return totalVolunteerHours
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalVolunteerHours() {
    return totalVolunteerHours;
  }

  public void setTotalVolunteerHours(Integer totalVolunteerHours) {
    this.totalVolunteerHours = totalVolunteerHours;
  }

  public Summary totalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
    return this;
  }

  /**
   * Get totalTravelHours
   * @return totalTravelHours
  **/
  @ApiModelProperty(value = "")


  public Integer getTotalTravelHours() {
    return totalTravelHours;
  }

  public void setTotalTravelHours(Integer totalTravelHours) {
    this.totalTravelHours = totalTravelHours;
  }

  public Summary overallHours(Integer overallHours) {
    this.overallHours = overallHours;
    return this;
  }

  /**
   * Get overallHours
   * @return overallHours
  **/
  @ApiModelProperty(value = "")


  public Integer getOverallHours() {
    return overallHours;
  }

  public void setOverallHours(Integer overallHours) {
    this.overallHours = overallHours;
  }

  public Summary livesImpacted(Integer livesImpacted) {
    this.livesImpacted = livesImpacted;
    return this;
  }

  /**
   * Get livesImpacted
   * @return livesImpacted
  **/
  @ApiModelProperty(value = "")


  public Integer getLivesImpacted() {
    return livesImpacted;
  }

  public void setLivesImpacted(Integer livesImpacted) {
    this.livesImpacted = livesImpacted;
  }

  public Summary activityType(String activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
  **/
  @ApiModelProperty(value = "")


  public String getActivityType() {
    return activityType;
  }

  public void setActivityType(String activityType) {
    this.activityType = activityType;
  }

  public Summary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Summary pocId(BigDecimal pocId) {
    this.pocId = pocId;
    return this;
  }

  /**
   * Get pocId
   * @return pocId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPocId() {
    return pocId;
  }

  public void setPocId(BigDecimal pocId) {
    this.pocId = pocId;
  }

  public Summary pocName(String pocName) {
    this.pocName = pocName;
    return this;
  }

  /**
   * Get pocName
   * @return pocName
  **/
  @ApiModelProperty(value = "")


  public String getPocName() {
    return pocName;
  }

  public void setPocName(String pocName) {
    this.pocName = pocName;
  }

  public Summary pocContact(BigDecimal pocContact) {
    this.pocContact = pocContact;
    return this;
  }

  /**
   * Get pocContact
   * @return pocContact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getPocContact() {
    return pocContact;
  }

  public void setPocContact(BigDecimal pocContact) {
    this.pocContact = pocContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Summary summary = (Summary) o;
    return Objects.equals(this.summaryId, summary.summaryId) &&
        Objects.equals(this.eventId, summary.eventId) &&
        Objects.equals(this.month, summary.month) &&
        Objects.equals(this.baseLocation, summary.baseLocation) &&
        Objects.equals(this.beneficiaryName, summary.beneficiaryName) &&
        Objects.equals(this.venueAddress, summary.venueAddress) &&
        Objects.equals(this.councilName, summary.councilName) &&
        Objects.equals(this.project, summary.project) &&
        Objects.equals(this.category, summary.category) &&
        Objects.equals(this.eventName, summary.eventName) &&
        Objects.equals(this.eventDescription, summary.eventDescription) &&
        Objects.equals(this.eventDate, summary.eventDate) &&
        Objects.equals(this.totalVolunteers, summary.totalVolunteers) &&
        Objects.equals(this.totalVolunteerHours, summary.totalVolunteerHours) &&
        Objects.equals(this.totalTravelHours, summary.totalTravelHours) &&
        Objects.equals(this.overallHours, summary.overallHours) &&
        Objects.equals(this.livesImpacted, summary.livesImpacted) &&
        Objects.equals(this.activityType, summary.activityType) &&
        Objects.equals(this.status, summary.status) &&
        Objects.equals(this.pocId, summary.pocId) &&
        Objects.equals(this.pocName, summary.pocName) &&
        Objects.equals(this.pocContact, summary.pocContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summaryId, eventId, month, baseLocation, beneficiaryName, venueAddress, councilName, project, category, eventName, eventDescription, eventDate, totalVolunteers, totalVolunteerHours, totalTravelHours, overallHours, livesImpacted, activityType, status, pocId, pocName, pocContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
    sb.append("    councilName: ").append(toIndentedString(councilName)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    totalVolunteers: ").append(toIndentedString(totalVolunteers)).append("\n");
    sb.append("    totalVolunteerHours: ").append(toIndentedString(totalVolunteerHours)).append("\n");
    sb.append("    totalTravelHours: ").append(toIndentedString(totalTravelHours)).append("\n");
    sb.append("    overallHours: ").append(toIndentedString(overallHours)).append("\n");
    sb.append("    livesImpacted: ").append(toIndentedString(livesImpacted)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pocId: ").append(toIndentedString(pocId)).append("\n");
    sb.append("    pocName: ").append(toIndentedString(pocName)).append("\n");
    sb.append("    pocContact: ").append(toIndentedString(pocContact)).append("\n");
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

