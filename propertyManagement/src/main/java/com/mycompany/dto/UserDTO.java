package com.mycompany.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
	private Long id;
	private String ownerName;
	private String ownerEmail;
	private String phone;
	private String password;
}
