package com.cg.customer.dto;

import java.sql.Date;

public class CreateCustomerRequest {
	
	private String name;
	private long mobileNumber;
	private String emailId;
	private Date date;
	private String gender;
	private String nationality;
	private long aadharNumber;
	private String pan;
	
	public CreateCustomerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateCustomerRequest(String name, long mobileNumber, String emailId, Date date, String gender,
			String nationality, long aadharNumber, String pan) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.date = date;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNumber = aadharNumber;
		this.pan = pan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "CreateCustomerRequest [name=" + name + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", date=" + date + ", gender=" + gender + ", nationality=" + nationality + ", aadharNumber="
				+ aadharNumber + ", pan=" + pan + "]";
	}
	
	
}
