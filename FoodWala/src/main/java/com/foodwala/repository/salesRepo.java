package com.foodwala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodwala.model.salesOrder;

public interface salesRepo extends JpaRepository<salesOrder, Integer>{

}
