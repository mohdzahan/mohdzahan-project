package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wecp.progressive.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
}
