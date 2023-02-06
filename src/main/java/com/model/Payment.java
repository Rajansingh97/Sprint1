package com.model;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;



	@Entity
	public class Payment {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer paymentId;
		@OneToOne
		@NotNull(message = "Payment Cannot Be Done Without Booking")
		private Booking booking;
		

		
		private String paymentInfo; // Wrong credentials or credential details if correct
		
		private Double paymentAmount;

		public Payment() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Payment(Integer paymentId, @NotNull(message = "Payment Cannot Be Done Without Booking") Booking booking,
				String paymentInfo, Double paymentAmount) {
			super();
			this.paymentId = paymentId;
			this.booking = booking;
			this.paymentInfo = paymentInfo;
			this.paymentAmount = paymentAmount;
		}

		public Integer getPaymentId() {
			return paymentId;
		}

		public void setPaymentId(Integer paymentId) {
			this.paymentId = paymentId;
		}

		public Booking getBooking() {
			return booking;
		}

		public void setBooking(Booking booking) {
			this.booking = booking;
		}

		public String getPaymentInfo() {
			return paymentInfo;
		}

		public void setPaymentInfo(String paymentInfo) {
			this.paymentInfo = paymentInfo;
		}

		public Double getPaymentAmount() {
			return paymentAmount;
		}

		public void setPaymentAmount(Double paymentAmount) {
			this.paymentAmount = paymentAmount;
		}

		@Override
		public String toString() {
			return "Payment [paymentId=" + paymentId + ", booking=" + booking + ", paymentInfo=" + paymentInfo
					+ ", paymentAmount=" + paymentAmount + "]";
		}

	

}
