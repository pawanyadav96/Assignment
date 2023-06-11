package com.foodwala.service;

import java.util.List;

import com.foodwala.exception.ProductException;
import com.foodwala.exception.salesOrderException;
import com.foodwala.model.salesOrder;

public interface salesService {
	
	 public salesOrder addSalesOrder(salesOrder salesOrder) throws ProductException ,salesOrderException;
	 
	 public List<salesOrder> allSaleOrder() throws salesOrderException;

}
