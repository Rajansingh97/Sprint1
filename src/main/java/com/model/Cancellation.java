package com.model;

import java.time.LocalDateTime;

public class Cancellation {
	private int cancellationID;
	private String reason;
	private LocalDateTime cancellationDate;
	public Cancellation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cancellation(int cancellationID, String reason, LocalDateTime cancellationDate) {
		super();
		this.cancellationID = cancellationID;
		this.reason = reason;
		this.cancellationDate = cancellationDate;
	}
	public int getCancellationID() {
		return cancellationID;
	}
	public void setCancellationID(int cancellationID) {
		this.cancellationID = cancellationID;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LocalDateTime getCancellationDate() {
		return cancellationDate;
	}
	public void setCancellationDate(LocalDateTime cancellationDate) {
		this.cancellationDate = cancellationDate;
	}
	@Override
	public String toString() {
		return "Cancellation [cancellationID=" + cancellationID + ", reason=" + reason + ", cancellationDate="
				+ cancellationDate + "]";
	}
	

}
