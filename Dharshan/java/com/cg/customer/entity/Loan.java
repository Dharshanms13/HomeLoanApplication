package com.cg.customer.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name = "loan_data")
public class Loan {
	
	@Id
	@GeneratedValue
	private int applicationid;
	
	@Column(name = "applicationdate")
	private Date date;
	
	@Column(name = "appliedamount")
	private float applyamount;
	
	@Column(name = "approvedamount")
	@Value("0")
	private float approveamount;
	
	@Column(name = "landverify")
	@Value("false")
	private boolean landverify;
	
	@Column(name = "fianaceverify")
	@Value("false")
	private boolean financeverify;
	
	@Column(name = "adminapprove")
	@Value("false")
	private boolean adminapprove;
	
	@Column(name = "status")
	//@Value("NV")
	private String status;
	
	@Column(name = "custid")
	private int id;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int applicationid, Date date, float applyamount, float approveamount,
			boolean landverify, boolean financeverify, boolean adminapprove, String status, int id) {
		super();
		this.applicationid = applicationid;
		this.date = date;
		this.applyamount = applyamount;
		this.approveamount = approveamount;
		this.landverify = landverify;
		this.financeverify = financeverify;
		this.adminapprove = adminapprove;
		this.status = status;
		this.id = id;
	}

	public Loan(Date date,  float applyamount, float approveamount, boolean landverify,
			boolean financeverify, boolean adminapprove, String status,  int id) {
		super();
		this.date = date;
		this.applyamount = applyamount;
		this.approveamount = approveamount;
		this.landverify = landverify;
		this.financeverify = financeverify;
		this.adminapprove = adminapprove;
		this.status = status;
		this.id = id;
	}

	public Loan(Date date, float applyamount, int id, String status) {
		super();
		this.date = date;
		this.applyamount = applyamount;
		this.id = id;
		this.status = status;
	}

	public int getApplicationid() {
		return applicationid;
	}

	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getApplyamount() {
		return applyamount;
	}

	public void setApplyamount(float applyamount) {
		this.applyamount = applyamount;
	}

	public float getApproveamount() {
		return approveamount;
	}

	public void setApproveamount(float approveamount) {
		this.approveamount = approveamount;
	}

	public boolean isLandverify() {
		return landverify;
	}

	public void setLandverify(boolean landverify) {
		this.landverify = landverify;
	}

	public boolean isFinanceverify() {
		return financeverify;
	}

	public void setFinanceverify(boolean financeverify) {
		this.financeverify = financeverify;
	}

	public boolean isAdminapprove() {
		return adminapprove;
	}

	public void setAdminapprove(boolean adminapprove) {
		this.adminapprove = adminapprove;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Loan [applicationid=" + applicationid + ", date=" + date + ", applyamount=" + applyamount
				+ ", approveamount=" + approveamount + ", landverify=" + landverify + ", financeverify=" + financeverify
				+ ", adminapprove=" + adminapprove + ", status=" + status + ", id=" + id + "]";
	}
	
	

}
