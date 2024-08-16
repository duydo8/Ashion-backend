package com.example.ashionbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MaterialProductId  implements Serializable {
	@Column(name = "material_id")
	private Integer materialId;
	@Column(name = "product_id")
	private Integer productId;
}
