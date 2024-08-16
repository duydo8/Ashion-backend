package com.example.ashionbackend.entities;

import com.example.ashionbackend.config.AbstractEntity;
import com.example.ashionbackend.enums.ERoleName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account extends AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(unique = true)
	private String username;
	@Column(name = "full_name")
	private String fullName;
	@Column(unique = true)
	private String email;
	@Column(name = "phone_number", unique = true)
	private String phoneNumber;
	private String password;
	private ERoleName role;
	@Column(name = "verification_code")
	private Integer verificationCode;
	@Column(name = "time_valid")
	private LocalDateTime timeValid;
	private Double priority;
//
//	public Account(String username, String email, String password, String phoneNumber, String fullName) {
//		this.username = username;
//		this.email = email;
//		this.password = password;
//		this.phoneNumber = phoneNumber;
//		this.fullName = fullName;
//	}
}
