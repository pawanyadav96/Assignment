package com.foodwala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodwala.exception.ProductException;
import com.foodwala.exception.salesOrderException;
import com.foodwala.model.OrderList;
import com.foodwala.model.Product;
import com.foodwala.model.salesOrder;
import com.foodwala.repository.ProductRepo;
import com.foodwala.repository.salesRepo;

@Service
public class salesServiceImpl implements salesService{

	@Autowired
	private salesRepo srepo;
	
	@Autowired 
	private ProductRepo prepo;
	@Override
	public salesOrder addSalesOrder(salesOrder salesOrder) throws ProductException, salesOrderException {
		  List<OrderList> orderItems = salesOrder.getOrderItems();
	        for (OrderList order : orderItems) {
	            Product product = order.getProduct();
                int QuantityNow = product.getStockquantity()-order.getSales_quantity();
	            if (QuantityNow < 0) {
	                throw new ProductException("No product available");
	            }

	            product.setStockquantity(QuantityNow);
	            prepo.save(product);
	        }
	        return srepo.save(salesOrder);
	}
	@Override
	public List<salesOrder> allSaleOrder() throws salesOrderException {
		List<salesOrder> Sales =srepo.findAll();
		return Sales;
	}

}
