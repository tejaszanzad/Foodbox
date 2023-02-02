package com.simplilearn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dishes")
public class Dish {

	@Id
	@GeneratedValue
	@Column(name = "DishId")
	private int dishId;
	
	@Column(name = "DishName")
	private String dishName;
	
	@Column(name = "Price")
	private int price;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="MenuId")
	private Menu menu;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="RestaurantId")
	private Restaurant restaurant;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="CategoryId")
	private Category category;

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
