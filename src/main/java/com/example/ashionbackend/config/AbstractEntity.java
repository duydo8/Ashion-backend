package com.example.ashionbackend.config;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity {
	@Column(name = "create_date")
	private LocalDateTime createDate = LocalDateTime.now();
	@Column(name = "update_date")
	private LocalDateTime updateDate = LocalDateTime.now();
	private int status = 1;
}