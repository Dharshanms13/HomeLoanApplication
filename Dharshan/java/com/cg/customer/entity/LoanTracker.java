package com.cg.customer.entity;

public class LoanTracker {
	
	private String status;
	private String financeApproval;
	private String landApproval;
	private String adminApproval;
	
	public LoanTracker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanTracker(String status, String financeApproval, String landApproval, String adminApproval) {
		super();
		this.status = status;
		this.financeApproval = financeApproval;
		this.landApproval = landApproval;
		this.adminApproval = adminApproval;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFinanceApproval() {
		return financeApproval;
	}

	public void setFinanceApproval(String financeApproval) {
		this.financeApproval = financeApproval;
	}

	public String getLandApproval() {
		return landApproval;
	}

	public void setLandApproval(String landApproval) {
		this.landApproval = landApproval;
	}

	public String getAdminApproval() {
		return adminApproval;
	}

	public void setAdminApproval(String adminApproval) {
		this.adminApproval = adminApproval;
	}

	@Override
	public String toString() {
		return "LoanTracker [status=" + status + ", financeApproval=" + financeApproval + ", landApproval="
				+ landApproval + ", adminApproval=" + adminApproval + "]";
	}
	
}
