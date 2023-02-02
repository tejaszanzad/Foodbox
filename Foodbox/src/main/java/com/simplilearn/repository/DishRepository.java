package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, Integer>{

}
