package com.example.restservice.entities.checkEnrollment;

public class CheckEnrollmentInput {

	private String cardToken;
	private String amount;
	private String currency;
	private boolean preferredDecoupledAuth;

	public CheckEnrollmentInput() {

	}

	public String getCardToken() {
		return cardToken;
	}

	public void setCardToken(String cardToken) {
		this.cardToken = cardToken;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean getPreferredDecoupledAuth() {
		return preferredDecoupledAuth;
	}

	public void setPreferredDecoupledAuth(boolean preferredDecoupledAuth) {
		this.preferredDecoupledAuth = preferredDecoupledAuth;
	}

}