package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.PaymentDetails;

@Repository
public interface PaymentDetailsRepository extends CrudRepository<PaymentDetails, Integer>{

}
