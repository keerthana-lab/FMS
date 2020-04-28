package com.cts.events.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dashboard {

	@Id
	@JsonProperty("totalEvents")
	private long totalEvents = 0;
	
	@JsonProperty("livesImpacted")
	private long livesImpacted = 0;
	
	@JsonProperty("totalVolunteers")
	private long totalVolunteers = 0;
	
	@JsonProperty("totalParticipants")
	private long totalParticipants = 0;

	public long getTotalEvents() {
		return totalEvents;
	}

	public void setTotalEvents(long totalEvents) {
		this.totalEvents = totalEvents;
	}

	public long getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(long livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public long getTotalVolunteers() {
		return totalVolunteers;
	}

	public void setTotalVolunteers(long totalVolunteers) {
		this.totalVolunteers = totalVolunteers;
	}

	public long getTotalParticipants() {
		return totalParticipants;
	}

	public void setTotalParticipants(long totalParticipants) {
		this.totalParticipants = totalParticipants;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (livesImpacted ^ (livesImpacted >>> 32));
		result = prime * result + (int) (totalEvents ^ (totalEvents >>> 32));
		result = prime * result
				+ (int) (totalParticipants ^ (totalParticipants >>> 32));
		result = prime * result
				+ (int) (totalVolunteers ^ (totalVolunteers >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dashboard other = (Dashboard) obj;
		if (livesImpacted != other.livesImpacted)
			return false;
		if (totalEvents != other.totalEvents)
			return false;
		if (totalParticipants != other.totalParticipants)
			return false;
		if (totalVolunteers != other.totalVolunteers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dashboard [totalEvents=" + totalEvents + ", livesImpacted="
				+ livesImpacted + ", totalVolunteers=" + totalVolunteers
				+ ", totalParticipants=" + totalParticipants + "]";
	}
	
	
	
}
