package com.foodwala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foodwala.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>
{

}
