package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Customer {
	
	

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer customerId;
		
		@NotNull
		private String customerName;
		
		@NotNull
		private String customerPassword;
		
		@NotNull
		private String address;
		
		@NotNull
		@Email
		private String email;
		
		@NotNull
		@Size(min = 10, max = 10)
		private String mobile;

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Customer(Integer customerId, @NotNull String customerName, @NotNull String customerPassword,
				@NotNull String address, @NotNull @Email String email,
				@NotNull @Size(min = 10, max = 10) String mobile) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerPassword = customerPassword;
			this.address = address;
			this.email = email;
			this.mobile = mobile;
		}

		public Integer getCustomerId() {
			return customerId;
		}

		public void setCustomerId(Integer customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerPassword() {
			return customerPassword;
		}

		public void setCustomerPassword(String customerPassword) {
			this.customerPassword = customerPassword;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword="
					+ customerPassword + ", address=" + address + ", email=" + email + ", mobile=" + mobile + "]";
		}
		
		
		

}
