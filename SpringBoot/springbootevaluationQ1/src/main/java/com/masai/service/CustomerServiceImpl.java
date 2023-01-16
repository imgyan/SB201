package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.CustomerException;
import com.masai.model.Customer;
import com.masai.model.CustomerDTO;
import com.masai.repository.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer registerCustomer(Customer Customer) throws CustomerException {

		Customer savedCustomer = customerDao.save(Customer);

		if (savedCustomer != null)
			return savedCustomer;
		else
			throw new CustomerException("Customer Not Saved...");
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
//	                        Optional<Customer> customer= customerDao.findById(customerId);
//	                        
//	                        if(customer.isEmpty()) {
//	                        	throw new CustomerException("Customer not found with id : "+customerId);
//	                        }
//	                        else 
//	                        	return customer.get();

		return customerDao.findById(customerId)
				.orElseThrow(() -> new CustomerException("Customer not found with id : " + customerId));

	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		Customer customer = customerDao.findByEmailAndPassword(email, password);

		if (customer != null)
			return customer;
		else
			throw new CustomerException("Customer not found with email :" + email + "and password : " + password);
	}

	@Override
	public Customer updateCustomerPassword(String username, String oldPassword, String newPassword)
			throws CustomerException {
		Customer customer = customerDao.findByCustomerName(username);

		if (customer != null) {

			if (customer.getPassword().equals(oldPassword)) {

				customer.setPassword(newPassword);
				return customerDao.save(customer);

			} else {
				throw new CustomerException("Please Enter correct oldPassword... :");
			}

		}

		else
			throw new CustomerException("Customer not found with username :" + username);
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		List<Customer> customers = customerDao.findAll();

		if (customers.size() == 0)
			throw new CustomerException("Customer not found..");
		else {
			return customers;
		}
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		Optional<Customer> customer = customerDao.findById(customerId);
		if (!customer.isEmpty()) {
			Customer existingcustomer = customer.get();

			customerDao.delete(existingcustomer);
			return existingcustomer;
		} else
			throw new CustomerException("Customer not found with id : " + customerId);

	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {

		List<Customer> customers = customerDao.findByAddress(address);

		if (customers.size() != 0) {

			return customers;
		} else
			throw new CustomerException("Customer not found with address : " + address);

	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		Optional<Customer> cOptional = customerDao.findById(customer.getPricustomerId());

		if (cOptional.isPresent()) {
			return customerDao.save(customer);
		} else {
			throw new CustomerException("Customer not found with id : " + customer.getPricustomerId());
		}

	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		List<Customer> customers = customerDao.findByAgeBetween(start_age, end_age);

		if (customers.size() != 0) {

			return customers;
		} else
			throw new CustomerException("Customer not found with age betwen : " + start_age + " " + end_age);
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		List<CustomerDTO> dtos = customerDao.findNameAddressAgeOfAllCustomers();
		if (dtos.size() != 0) {

			return dtos;
		} else
			throw new CustomerException("Customer not found....... ");

	}

}
