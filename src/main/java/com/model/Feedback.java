package com.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
	public class Feedback {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer feedbackId;
		@NotNull
		private String feedback;
		@NotNull
		private Integer rating;
		
		@NotNull
		private LocalDateTime submitDate = LocalDateTime.now();

		public Feedback() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Feedback(Integer feedbackId, @NotNull String feedback, @NotNull Integer rating,
				@NotNull LocalDateTime submitDate) {
			super();
			this.feedbackId = feedbackId;
			this.feedback = feedback;
			this.rating = rating;
			this.submitDate = submitDate;
		}

		public Integer getFeedbackId() {
			return feedbackId;
		}

		public void setFeedbackId(Integer feedbackId) {
			this.feedbackId = feedbackId;
		}

		public String getFeedback() {
			return feedback;
		}

		public void setFeedback(String feedback) {
			this.feedback = feedback;
		}

		public Integer getRating() {
			return rating;
		}

		public void setRating(Integer rating) {
			this.rating = rating;
		}

		public LocalDateTime getSubmitDate() {
			return submitDate;
		}

		public void setSubmitDate(LocalDateTime submitDate) {
			this.submitDate = submitDate;
		}

		@Override
		public String toString() {
			return "Feedback [feedbackId=" + feedbackId + ", feedback=" + feedback + ", rating=" + rating
					+ ", submitDate=" + submitDate + "]";
		}
		
		
		
		
		
	
	
}
