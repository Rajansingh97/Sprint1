package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int adminID;
	
	@NotNull
	@NotBlank
	@Size(min = 2, max = 15, message = "Name should be min 2 and maximum 15 characters long")
	private String adminName;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	@NotBlank
//	@Size(min = 8, max = 15, message = "Password should be minimum 8 and maximum 15 characters long")
	private String password;
	
	@NotNull
	@NotBlank
	@Size(min = 10, max = 10, message = "Mobile numbers should be 10 digit long")
	private String mobile;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminID, String adminName, String email, String password, String mobile) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + "]";
	}

}
