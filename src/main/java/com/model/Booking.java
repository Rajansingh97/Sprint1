package com.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	@NotBlank(message = "description cannot be null")
	private String description;
	@NotBlank(message = "bookingTitle cannot be null")
	private String bookingTitle;
	
	private LocalDateTime bookingDate;

	private Double totalCost;
	
	@NotNull(message = "Number Of Person Cannot Be Null")
	@Min(value = 1, message = "Number Of Person Should Be Atleast 1")
	private Integer noOfPersons;

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, @NotBlank(message = "description cannot be null") String description,
			@NotBlank(message = "bookingTitle cannot be null") String bookingTitle, LocalDateTime bookingDate,
			Double totalCost,
			@NotNull(message = "Number Of Person Cannot Be Null") @Min(value = 1, message = "Number Of Person Should Be Atleast 1") Integer noOfPersons) {
		super();
		this.bookingId = bookingId;
		this.description = description;
		this.bookingTitle = bookingTitle;
		this.bookingDate = bookingDate;
		this.totalCost = totalCost;
		this.noOfPersons = noOfPersons;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBookingTitle() {
		return bookingTitle;
	}

	public void setBookingTitle(String bookingTitle) {
		this.bookingTitle = bookingTitle;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Integer getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(Integer noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", description=" + description + ", bookingTitle=" + bookingTitle
				+ ", bookingDate=" + bookingDate + ", totalCost=" + totalCost + ", noOfPersons=" + noOfPersons + "]";
	}	

	
	
}
