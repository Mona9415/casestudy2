package com.ibm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Login {
	@Id

	private int id;
	@NotBlank(message = "User name can't be empty!")
	@NotNull (message = "User name can't be null!")
	private String userName;
	@NotBlank(message = "Password can't be empty!")
	@NotNull (message = "password can't be null!")
	private String password;

}
