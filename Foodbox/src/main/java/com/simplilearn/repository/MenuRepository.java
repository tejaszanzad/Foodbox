package com.simplilearn.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.entity.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer>{

}
