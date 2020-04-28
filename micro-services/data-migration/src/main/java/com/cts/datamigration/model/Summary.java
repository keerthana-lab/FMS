package com.cts.datamigration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Summary {

	  @Id
	  @GeneratedValue
	  private int summaryId;

	  private String eventId;

	  private String month;

	  private String baseLocation;

	  private String beneficiaryName;

	  private String venueAddress;

	  private String councilName;

	  private String project;

	  private String category;

	  private String eventName;

	  private String eventDescription;

	  private String eventDate;

	  private String totalVolunteers;

	  private String totalVolunteerHours;

	  private String totalTravelHours;

	  private String overallHours;

	  private String livesImpacted;

	  private String activityType;

	  private String status;

	  private String pocId;

	  private String pocName;

	  private String pocContact;

	public Summary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Summary(int summaryId, String eventId, String month, String baseLocation, String beneficiaryName,
			String venueAddress, String councilName, String project, String category, String eventName,
			String eventDescription, String eventDate, String totalVolunteers, String totalVolunteerHours,
			String totalTravelHours, String overallHours, String livesImpacted, String activityType, String status,
			String pocId, String pocName, String pocContact) {
		super();
		this.summaryId = summaryId;
		this.eventId = eventId;
		this.month = month;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.venueAddress = venueAddress;
		this.councilName = councilName;
		this.project = project;
		this.category = category;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.totalVolunteers = totalVolunteers;
		this.totalVolunteerHours = totalVolunteerHours;
		this.totalTravelHours = totalTravelHours;
		this.overallHours = overallHours;
		this.livesImpacted = livesImpacted;
		this.activityType = activityType;
		this.status = status;
		this.pocId = pocId;
		this.pocName = pocName;
		this.pocContact = pocContact;
	}

	public int getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(int summaryId) {
		this.summaryId = summaryId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getTotalVolunteers() {
		return totalVolunteers;
	}

	public void setTotalVolunteers(String totalVolunteers) {
		this.totalVolunteers = totalVolunteers;
	}

	public String getTotalVolunteerHours() {
		return totalVolunteerHours;
	}

	public void setTotalVolunteerHours(String totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
	}

	public String getTotalTravelHours() {
		return totalTravelHours;
	}

	public void setTotalTravelHours(String totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
	}

	public String getOverallHours() {
		return overallHours;
	}

	public void setOverallHours(String overallHours) {
		this.overallHours = overallHours;
	}

	public String getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(String livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPocId() {
		return pocId;
	}

	public void setPocId(String pocId) {
		this.pocId = pocId;
	}

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public String getPocContact() {
		return pocContact;
	}

	public void setPocContact(String pocContact) {
		this.pocContact = pocContact;
	}

	@Override
	public String toString() {
		return "Summary [summaryId=" + summaryId + ", eventId=" + eventId + ", month=" + month + ", baseLocation="
				+ baseLocation + ", beneficiaryName=" + beneficiaryName + ", venueAddress=" + venueAddress
				+ ", councilName=" + councilName + ", project=" + project + ", category=" + category + ", eventName="
				+ eventName + ", eventDescription=" + eventDescription + ", eventDate=" + eventDate
				+ ", totalVolunteers=" + totalVolunteers + ", totalVolunteerHours=" + totalVolunteerHours
				+ ", totalTravelHours=" + totalTravelHours + ", overallHours=" + overallHours + ", livesImpacted="
				+ livesImpacted + ", activityType=" + activityType + ", status=" + status + ", pocId=" + pocId
				+ ", pocName=" + pocName + ", pocContact=" + pocContact + "]";
	}
	  
	  
	
}
