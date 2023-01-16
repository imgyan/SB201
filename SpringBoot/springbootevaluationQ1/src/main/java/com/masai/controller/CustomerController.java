package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customers")
	public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer customer){
		       Customer savedCustomer= customerService.registerCustomer(customer);
		       
		       return new ResponseEntity<Customer>(savedCustomer,HttpStatus.CREATED);
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> findCustomerById(@PathVariable("id") Integer customerId){
		                   Customer customer=  customerService.getCustomerById(customerId);
		                   
		                   return new ResponseEntity<Customer>(customer,HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/customers")
	public ResponseEntity<Customer> loginCustomer(@RequestParam("email") String email,@RequestParam("password")String password){
		                   Customer customer=  customerService.loginCustomer(email, password);
		                   
		                   return new ResponseEntity<Customer>(customer,HttpStatus.ACCEPTED);
	}
	
	
	@PatchMapping("/customers/{username}")
	public ResponseEntity<Customer> updateCustomerPassword(@PathVariable("username") String username, @RequestParam("oldPassword") String oldPassword, @RequestParam("newPassword") String newPassword){
		                   Customer customer=  customerService.updateCustomerPassword(username, oldPassword, newPassword);
		                   
		                   return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@GetMapping("/getallcustomers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		List<Customer> customers=  customerService.getAllCustomerDetails();
		                   
		                   return new ResponseEntity<>(customers,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/coustomer/{id}")
	public ResponseEntity<Customer> detelCustomerBy(@PathVariable("id") Integer id){
		           Customer customer= customerService.deleteCustomerById(id);
		           
		           return new ResponseEntity<>(customer,HttpStatus.ACCEPTED);
	}
	
	

	@GetMapping("/getallcustomersbyaddress/{address}")
	public ResponseEntity<List<Customer>> getAllCustomersByAdd(@PathVariable("address") String address){
		List<Customer> customers=  customerService.getCustomerDetailsByAddress(address);
		                   
		        return new ResponseEntity<>(customers,HttpStatus.ACCEPTED);
	}
	
	
	@PatchMapping("/updatecustomers")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer ){
		                   Customer savedcustomer=  customerService.updateCustomer(customer);
		                   
		                   return new ResponseEntity<Customer>(savedcustomer,HttpStatus.OK);
	}
	
	
	@GetMapping("/getallcustomersbyagebetween/{start_age}/{end_age}")
	public ResponseEntity<List<Customer>> getAllCustomersByAge(@PathVariable("start_age") Integer start_age,@PathVariable("end_age") Integer end_age){
		List<Customer> customers=  customerService.getCustomersBetweenAge(start_age, end_age);
		                   
		        return new ResponseEntity<>(customers,HttpStatus.ACCEPTED);
	}
	
	
	
	@GetMapping("/getallcustomersbynameaddressage")
	public ResponseEntity<List<CustomerDTO>> getAllCustomersByAge(){
		List<CustomerDTO> customers=  customerService.getNameAddressAgeOfAllCustomers();
		                   
		        return new ResponseEntity<>(customers,HttpStatus.ACCEPTED);
	}
	
	
	
	
	
	
}
