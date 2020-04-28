package com.cts.events.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

public class Event   {
	
	@Id
	@JsonProperty("eventNo")
	private Integer eventNo = null;
	
  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("baseLocation")
  private String baseLocation = null;

  @JsonProperty("beneficiaryName")
  private String beneficiaryName = null;

  @JsonProperty("councilName")
  private String councilName = null;

  @JsonProperty("eventName")
  private String eventName = null;

  @JsonProperty("eventDescription")
  private String eventDescription = null;

  @JsonProperty("eventDate")
  private Date eventDate = null;

  @JsonProperty("empId")
  private BigDecimal empId = null;

  @JsonProperty("empName")
  private String empName = null;

  @JsonProperty("volunteerHours")
  private Integer volunteerHours = null;

  @JsonProperty("travelHours")
  private Integer travelHours = null;

  @JsonProperty("livesImpacted")
  private Integer livesImpacted = null;

  @JsonProperty("businessUnit")
  private String businessUnit = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("iiepCategory")
  private String iiepCategory = null;

  @JsonProperty("summaryId")
  private Integer summaryId = null;

  public Event eventId(String eventId) {
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

  public Integer getEventNo() {
	return eventNo;
}

public void setEventNo(Integer eventNo) {
	this.eventNo = eventNo;
}

public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public Event baseLocation(String baseLocation) {
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

  public Event beneficiaryName(String beneficiaryName) {
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

  public Event councilName(String councilName) {
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

  public Event eventName(String eventName) {
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

  public Event eventDescription(String eventDescription) {
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

  public Event eventDate(Date eventDate) {
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

  public Event empId(BigDecimal empId) {
    this.empId = empId;
    return this;
  }

  /**
   * Get empId
   * @return empId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getEmpId() {
    return empId;
  }

  public void setEmpId(BigDecimal empId) {
    this.empId = empId;
  }

  public Event empName(String empName) {
    this.empName = empName;
    return this;
  }

  /**
   * Get empName
   * @return empName
  **/
  @ApiModelProperty(value = "")


  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Event volunteerHours(Integer volunteerHours) {
    this.volunteerHours = volunteerHours;
    return this;
  }

  /**
   * Get volunteerHours
   * @return volunteerHours
  **/
  @ApiModelProperty(value = "")


  public Integer getVolunteerHours() {
    return volunteerHours;
  }

  public void setVolunteerHours(Integer volunteerHours) {
    this.volunteerHours = volunteerHours;
  }

  public Event travelHours(Integer travelHours) {
    this.travelHours = travelHours;
    return this;
  }

  /**
   * Get travelHours
   * @return travelHours
  **/
  @ApiModelProperty(value = "")


  public Integer getTravelHours() {
    return travelHours;
  }

  public void setTravelHours(Integer travelHours) {
    this.travelHours = travelHours;
  }

  public Event livesImpacted(Integer livesImpacted) {
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

  public Event businessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }

  /**
   * Get businessUnit
   * @return businessUnit
  **/
  @ApiModelProperty(value = "")


  public String getBusinessUnit() {
    return businessUnit;
  }

  public void setBusinessUnit(String businessUnit) {
    this.businessUnit = businessUnit;
  }

  public Event status(String status) {
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

  public Event iiepCategory(String iiepCategory) {
    this.iiepCategory = iiepCategory;
    return this;
  }

  /**
   * Get iiepCategory
   * @return iiepCategory
  **/
  @ApiModelProperty(value = "")


  public String getIiepCategory() {
    return iiepCategory;
  }

  public void setIiepCategory(String iiepCategory) {
    this.iiepCategory = iiepCategory;
  }

  public Event summaryId(Integer summaryId) {
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


  @Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Event other = (Event) obj;
	if (baseLocation == null) {
		if (other.baseLocation != null)
			return false;
	} else if (!baseLocation.equals(other.baseLocation))
		return false;
	if (beneficiaryName == null) {
		if (other.beneficiaryName != null)
			return false;
	} else if (!beneficiaryName.equals(other.beneficiaryName))
		return false;
	if (businessUnit == null) {
		if (other.businessUnit != null)
			return false;
	} else if (!businessUnit.equals(other.businessUnit))
		return false;
	if (councilName == null) {
		if (other.councilName != null)
			return false;
	} else if (!councilName.equals(other.councilName))
		return false;
	if (empId == null) {
		if (other.empId != null)
			return false;
	} else if (!empId.equals(other.empId))
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (eventDate == null) {
		if (other.eventDate != null)
			return false;
	} else if (!eventDate.equals(other.eventDate))
		return false;
	if (eventDescription == null) {
		if (other.eventDescription != null)
			return false;
	} else if (!eventDescription.equals(other.eventDescription))
		return false;
	if (eventId == null) {
		if (other.eventId != null)
			return false;
	} else if (!eventId.equals(other.eventId))
		return false;
	if (eventName == null) {
		if (other.eventName != null)
			return false;
	} else if (!eventName.equals(other.eventName))
		return false;
	if (eventNo == null) {
		if (other.eventNo != null)
			return false;
	} else if (!eventNo.equals(other.eventNo))
		return false;
	if (iiepCategory == null) {
		if (other.iiepCategory != null)
			return false;
	} else if (!iiepCategory.equals(other.iiepCategory))
		return false;
	if (livesImpacted == null) {
		if (other.livesImpacted != null)
			return false;
	} else if (!livesImpacted.equals(other.livesImpacted))
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	if (summaryId == null) {
		if (other.summaryId != null)
			return false;
	} else if (!summaryId.equals(other.summaryId))
		return false;
	if (travelHours == null) {
		if (other.travelHours != null)
			return false;
	} else if (!travelHours.equals(other.travelHours))
		return false;
	if (volunteerHours == null) {
		if (other.volunteerHours != null)
			return false;
	} else if (!volunteerHours.equals(other.volunteerHours))
		return false;
	return true;
}

  @Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((baseLocation == null) ? 0 : baseLocation.hashCode());
	result = prime * result + ((beneficiaryName == null) ? 0 : beneficiaryName.hashCode());
	result = prime * result + ((businessUnit == null) ? 0 : businessUnit.hashCode());
	result = prime * result + ((councilName == null) ? 0 : councilName.hashCode());
	result = prime * result + ((empId == null) ? 0 : empId.hashCode());
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
	result = prime * result + ((eventDescription == null) ? 0 : eventDescription.hashCode());
	result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
	result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
	result = prime * result + ((eventNo == null) ? 0 : eventNo.hashCode());
	result = prime * result + ((iiepCategory == null) ? 0 : iiepCategory.hashCode());
	result = prime * result + ((livesImpacted == null) ? 0 : livesImpacted.hashCode());
	result = prime * result + ((status == null) ? 0 : status.hashCode());
	result = prime * result + ((summaryId == null) ? 0 : summaryId.hashCode());
	result = prime * result + ((travelHours == null) ? 0 : travelHours.hashCode());
	result = prime * result + ((volunteerHours == null) ? 0 : volunteerHours.hashCode());
	return result;
}

  @Override
public String toString() {
	return "Event [eventNo=" + eventNo + ", eventId=" + eventId + ", baseLocation=" + baseLocation
			+ ", beneficiaryName=" + beneficiaryName + ", councilName=" + councilName + ", eventName=" + eventName
			+ ", eventDescription=" + eventDescription + ", eventDate=" + eventDate + ", empId=" + empId + ", empName="
			+ empName + ", volunteerHours=" + volunteerHours + ", travelHours=" + travelHours + ", livesImpacted="
			+ livesImpacted + ", businessUnit=" + businessUnit + ", status=" + status + ", iiepCategory=" + iiepCategory
			+ ", summaryId=" + summaryId + "]";
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

