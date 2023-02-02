package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
