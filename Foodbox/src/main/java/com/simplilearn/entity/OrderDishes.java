package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderdishes")
public class OrderDishes {

	@Id
	@GeneratedValue
	@Column(name = "OrderDishId")
	private int orderdishesId;
	
	private Order order;
	
	private Dish dish;
	
	@Column(name = "Qty")
	private int qty;

	public int getOrderdishesId() {
		return orderdishesId;
	}

	public void setOrderdishesId(int orderdishesId) {
		this.orderdishesId = orderdishesId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	
	
	

}
