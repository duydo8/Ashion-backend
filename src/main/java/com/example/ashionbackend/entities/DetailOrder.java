package com.example.ashionbackend.entities;

import com.example.ashionbackend.config.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "detail_orders")
public class DetailOrder extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "order_id")
	private Integer orderId;
	@Column(name = "detail_product_id")
	private Integer detailProductId;
	private Integer quantity;
	private Double price;
	@Column(name = "total_price")
	private Double totalPrice;
	@Column(name = "detail_order_code")
	private String detailOrderCode;
	@Column(name = "reason")
	private String reason;
}
