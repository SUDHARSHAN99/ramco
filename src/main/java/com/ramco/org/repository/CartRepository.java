package com.ramco.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramco.org.entity.CartEntity;


public interface CartRepository extends JpaRepository<CartEntity, Long> {
  
	List<CartEntity> findById(long id);

}
