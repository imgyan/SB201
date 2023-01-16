package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Customer;
import com.masai.model.CustomerDTO;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Customer findByEmailAndPassword(String email, String password);

	public Customer findByCustomerName(String username);

	public List<Customer> findByAddress(String address);

	public List<Customer> findByAgeBetween(Integer start_age, Integer end_age);
	
    @Query("select new com.masai.model.CustomerDTO(s.customerName,s.address,s.age) from Customer s")
	public List<CustomerDTO> findNameAddressAgeOfAllCustomers();

}
