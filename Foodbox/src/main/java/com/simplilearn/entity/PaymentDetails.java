package com.simplilearn.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "paymentdetails")
public class PaymentDetails {

	@Id
	@GeneratedValue
	@Column(name = "PaymentId")
	private int paymentId;
	
	@Column(name = "NameOnTheCard")
	private String nameontheCard;
	
	@Column(name = "CardNumber")
	private int cardNumber;
	
	@Column(name = "ExpirationDate")
	private Date expirationDate;
	
	@Column(name = "CVV")
	private int cvv;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CustomerId")
	private Customer customer;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public String getNameontheCard() {
		return nameontheCard;
	}

	public void setNameontheCard(String nameontheCard) {
		this.nameontheCard = nameontheCard;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
