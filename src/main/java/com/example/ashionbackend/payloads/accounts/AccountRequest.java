package com.example.ashionbackend.payloads.accounts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {
	private String username;
	private String fullName;
	private String email;
	private String phoneNumber;
	private String password;
	private boolean role;
}
