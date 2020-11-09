package com.ramco.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramco.org.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
  
	List<ProductEntity> findById(long id);
}
