package com.jaga.target.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaga.target.entity.Price;

@Repository
public interface PriceInt extends JpaRepository<Price, Integer>{
	List<Price> findByProductId(Integer productId);
}
