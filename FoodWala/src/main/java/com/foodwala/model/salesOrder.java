package com.foodwala.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

public class salesOrder {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String customer;
	    private LocalDateTime timestamp;
	    
	    @OneToMany(mappedBy = "sOrder",cascade = CascadeType.ALL)
	    private List<OrderList> orderItems;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCustomer() {
			return customer;
		}

		public void setCustomer(String customer) {
			this.customer = customer;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

		public List<OrderList> getOrderItems() {
			return orderItems;
		}

		public void setOrderItems(List<OrderList> orderItems) {
			this.orderItems = orderItems;
		}

		public salesOrder(Long id, String customer, LocalDateTime timestamp, List<OrderList> orderItems) {
			super();
			this.id = id;
			this.customer = customer;
			this.timestamp = timestamp;
			this.orderItems = orderItems;
		}

		public salesOrder() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    
}
