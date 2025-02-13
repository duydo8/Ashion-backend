package com.example.ashionbackend.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class TagProductId implements Serializable {
	@Column(name = "tag_id")
	private Integer tagId;
	@Column(name = "product_id")
	private Integer productId;
}
