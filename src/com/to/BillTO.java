package com.to;

import java.util.Calendar;

public class BillTO {
	private Integer BillId;
	private String name;
	private Long mobileNumber;
	private Double amount;
	private String mobileOperator;
	private Calendar dateOfPayment;
	private String typeOfConnection;
	
	//setter and getter methods
	public Integer getBillId() {
		return BillId;
	}
	public void setBillId(Integer billId) {
		BillId = billId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMobileOperator() {
		return mobileOperator;
	}
	public void setMobileOperator(String mobileOperator) {
		this.mobileOperator = mobileOperator;
	}
	public Calendar getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(Calendar dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public String getTypeOfConnection() {
		return typeOfConnection;
	}
	public void setTypeOfConnection(String typeOfConnection) {
		this.typeOfConnection = typeOfConnection;
	}
}
