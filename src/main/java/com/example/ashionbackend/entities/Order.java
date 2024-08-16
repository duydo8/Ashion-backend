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
@Table(name = "orders")
public class Order extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "account_id")
	private Integer accountId;
	@Column(name = "address_id")
	private Integer addressId;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "amount_price")
	private Double amountPrice;
	@Column(name = "sale_price")
	private Double salePrice;
	@Column(name = "total_price")
	private Double totalPrice;
	@Column(name = "address_detail")
	private String addressDetail;
	@Column(name = "order_code")
	private String orderCode;
	@Column(name = "return_order_price")
	private Double returnOrderPrice = 0.0;
}
