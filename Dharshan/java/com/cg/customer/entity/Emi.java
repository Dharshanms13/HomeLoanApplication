package com.cg.customer.entity;


public class Emi {
	private double loanAmount;
	private double rateOfInterest;
	private int timePeriod;
	private double interest;
	private double emiAmount;
	private double totalEmiAmount;
	private double totalAmount;
	
	public Emi() {
		super();
	}

	public Emi(double loanAmount, double rateOfInterest, int timePeriod, double interest, double emiAmount,
			double totalEmiAmount, double totalAmount) {
		super();
		this.loanAmount = loanAmount;
		this.rateOfInterest = rateOfInterest;
		this.timePeriod = timePeriod;
		this.interest = interest;
		this.emiAmount = emiAmount;
		this.totalEmiAmount = totalEmiAmount;
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Emi [loanAmount=" + loanAmount + ", rateOfInterest=" + rateOfInterest + ", timePeriod=" + timePeriod
				+ ", interest=" + interest + ", emiAmount=" + emiAmount + ", totalEmiAmount=" + totalEmiAmount
				+ ", totalAmount=" + totalAmount + "]";
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public int getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(int timePeriod) {
		this.timePeriod = timePeriod;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getTotalEmiAmount() {
		return totalEmiAmount;
	}

	public void setTotalEmiAmount(double totalEmiAmount) {
		this.totalEmiAmount = totalEmiAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

}
