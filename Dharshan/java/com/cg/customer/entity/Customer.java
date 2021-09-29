package com.cg.customer.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cust_data")
public class Customer {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "mobilenumber")
	private long mobileNumber;
	@Column(name = "email")
	private String emaild;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String gender;
	@Column(name = "nationality")
	private String nationality;
	@Column(name = "aadharnumber")
	private long aadharNumber;
	@Column(name = "pan")
	private String pan;
	
//	@OneToOne
//	private CustomerLogin custLogin;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, long mobileNumber, String emaild, Date dob, String gender, String nationality,
			long aadharNumber, String pan) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emaild = emaild;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNumber = aadharNumber;
		this.pan = pan;
	}

	public Customer(Integer id, String name, long mobileNumber, String emaild, Date dob, String gender, String nationality,
			long aadharNumber, String pan) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emaild = emaild;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNumber = aadharNumber;
		this.pan = pan;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmaild() {
		return emaild;
	}

	public void setEmaild(String emaild) {
		this.emaild = emaild;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

//	public CustomerLogin getCustLogin() {
//		return custLogin;
//	}
//
//	public void setCustLogin(CustomerLogin custLogin) {
//		this.custLogin = custLogin;
//	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", emaild=" + emaild
				+ ", dob=" + dob + ", gender=" + gender + ", nationality=" + nationality + ", aadharNumber="
				+ aadharNumber + ", pan=" + pan + "]";
	}
	
	
	
}
