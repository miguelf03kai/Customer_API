package com.customer.api.services;

import com.customer.api.models.*;

public interface CustomerService {
	Iterable<Customer> findAll();

	Customer findById(Integer id);

	void add(Customer customer);

	void update(Integer id, Customer customer);

	void delete(Integer id);
}
