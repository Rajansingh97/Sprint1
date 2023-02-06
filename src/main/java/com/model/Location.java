package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Location {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer LocationId;
	@NotNull(message = "Location From Cannot Be Null!")
	private String LocationFrom;
	@NotNull(message = "Location To Cannot Be Null!")
	private String LocationTo;
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Location(Integer locationId, @NotNull(message = "Location From Cannot Be Null!") String locationFrom,
			@NotNull(message = "Location To Cannot Be Null!") String locationTo) {
		super();
		LocationId = locationId;
		LocationFrom = locationFrom;
		LocationTo = locationTo;
	}
	public Integer getLocationId() {
		return LocationId;
	}
	public void setLocationId(Integer locationId) {
		LocationId = locationId;
	}
	public String getLocationFrom() {
		return LocationFrom;
	}
	public void setLocationFrom(String locationFrom) {
		LocationFrom = locationFrom;
	}
	public String getLocationTo() {
		return LocationTo;
	}
	public void setLocationTo(String locationTo) {
		LocationTo = locationTo;
	}
	@Override
	public String toString() {
		return "Location [LocationId=" + LocationId + ", LocationFrom=" + LocationFrom + ", LocationTo=" + LocationTo
				+ "]";
	}
	
	

}
