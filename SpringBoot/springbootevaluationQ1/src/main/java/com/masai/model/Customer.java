package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pricustomerId;

	@Size(min = 3, max = 10, message = "Customer name should be min 3 and max 10")
	private String customerName;
	
	@Size(min = 3, max = 10, message = "Customer Address should be min 3 and max 15")
	private String address;

	@Min(value = 18, message = "Age should be greater than 18")
	
	private Integer age;
	
	@Email(message = "Email should be in a proper formate")
	private String email;
	
	//@Pattern(regexp ="^[6-9]",message = "Mobile should start with Either 6,7,8,9")
	
	@Pattern(regexp="(^$|{6,9}[0-9]{10})")
	private String mobile;
	
	@Size(min = 3, max = 10, message = "Password should be min 3 and max 15")
	private String password;
}
