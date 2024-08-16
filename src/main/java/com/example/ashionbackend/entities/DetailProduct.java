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
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "detail_products")
@Entity
public class DetailProduct extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@JoinColumn(name = "product_id")
	private Integer productId;
	@JoinColumn(name = "color_id")
	private Integer colorId;
	@JoinColumn(name = "size_id")
	private Integer sizeId;
	private Integer quantity;
	@Column(name = "price_import")
	private Double priceImport;
	@Column(name = "price_export")
	private Double priceExport;
	@Column(name = "product_image")
	private String productImage;
}
