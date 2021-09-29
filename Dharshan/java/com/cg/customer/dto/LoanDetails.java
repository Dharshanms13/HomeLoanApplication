package com.cg.customer.dto;

import java.sql.Date;

public class LoanDetails {
	
	private int applicationid;
	private Date date;
	private float applyamount;
	private float approveamount;
	private boolean landverify;
	private boolean financeverify;
	private boolean adminapprove;
	private String status;
	private int id;
	
	public LoanDetails() {
		super();
	}

	public LoanDetails(int applicationid, Date date, float applyamount, float approveamount, boolean landverify,
			boolean financeverify, boolean adminapprove, String status, int id) {
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
		return "LoanDetails [applicationid=" + applicationid + ", date=" + date + ", applyamount=" + applyamount
				+ ", approveamount=" + approveamount + ", landverify=" + landverify + ", financeverify=" + financeverify
				+ ", adminapprove=" + adminapprove + ", status=" + status + ", id=" + id + "]";
	}
	
}
