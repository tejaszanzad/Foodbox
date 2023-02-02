package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.OrderDishes;

@Repository
public interface OrderDishesRepository extends CrudRepository<OrderDishes, Integer>{

}
