package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
