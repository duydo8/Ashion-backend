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
@Table(name = "address")
public class Address extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "ward_id")
	private Integer wardId;
	@Column(name = "province_id")
	private Integer provinceId;
	@Column(name = "district_id")
	private Integer districtId;
	@Column(name = "account_id")
	private Integer accountId;
	@Column(name = "address_detail")
	private String addressDetail;
	@Column(name = "phone_number")
	private String phoneNumber;
	@Column(name = "full_name")
	private String fullName;
	@Column(name = "is_default")
	private Boolean isDefault;
}
