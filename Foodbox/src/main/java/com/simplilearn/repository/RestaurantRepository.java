package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer>{

}
