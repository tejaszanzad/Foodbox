package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{

}
