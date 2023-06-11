package com.foodwala.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodwala.exception.ProductException;
import com.foodwala.model.Product;

@Service
public interface ProductService {
	
	public Product createProduct(Product product) throws ProductException;
	
    public Product IncreaseProductQuantity(Integer productId,Integer quantity) throws ProductException;
    
	public Product DecreseProductQuantity(Integer productId,Integer quantity) throws ProductException;
	
	public List<Product> getAllProduct();
	

}
