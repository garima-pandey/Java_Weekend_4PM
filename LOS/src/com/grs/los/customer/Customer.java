package com.grs.los.customer;

public class Customer {
	private int id;
	private int stage;
	private PersonalInformation personal; // Has - A Relationship
	private LoanDetails loanDetails; // Has - A Relationship
	private double income;
	private double liability;
	private String remarks;
	
	public PersonalInformation getPersonal() {
		return personal;
	}

	public void setPersonal(PersonalInformation personal) {
		this.personal = personal;
	}

	public LoanDetails getLoanDetails() {
		return loanDetails;
	}

	public void setLoanDetails(LoanDetails loanDetails) {
		this.loanDetails = loanDetails;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getLiability() {
		return liability;
	}

	public void setLiability(double liability) {
		this.liability = liability;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
}
