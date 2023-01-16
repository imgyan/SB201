package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer accountNo;
	@NotNull
	private String accountholder;
	@Size(min = 6,max = 10)
	private String address;
	@Email
	private String email;
	@Min(10000)
	private Integer balance;
	private String mobile;
	public Account(Integer accountNo, @NotNull String accountholder, @Size(min = 6, max = 10) String address,
			@Email String email, Integer balance, String mobile) {
		super();
		this.accountNo = accountNo;
		this.accountholder = accountholder;
		this.address = address;
		this.email = email;
		this.balance = balance;
		this.mobile = mobile;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountholder=" + accountholder + ", address=" + address
				+ ", email=" + email + ", balance=" + balance + ", mobile=" + mobile + "]";
	}
	
	

}
