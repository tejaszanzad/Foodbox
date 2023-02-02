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
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "OrderId")
	private int orderId;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CustomerId")
	private Customer customer; 
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="AddressId")
    private Address address;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="RestaurantId")
	private Restaurant restaurant;
	
	@Column(name = "TotalPrice")
	private int totalprice;
	
	@Column(name = "DateTime")
	private Date datetime;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	
	
	
}
