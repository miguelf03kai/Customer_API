package com.customer.api.services.strategy;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.api.models.Andress;
import com.customer.api.models.AndressRepository;
import com.customer.api.models.Customer;
import com.customer.api.models.CustomerRespository;
import com.customer.api.services.CEPService;
import com.customer.api.services.CustomerService;

@Service
public class CustomerServiceStrategy implements CustomerService{

	@Autowired
	private CustomerRespository customerRespository;
	@Autowired
	private AndressRepository andressRepository;
	@Autowired
	private CEPService cepService;
	
	@Override
	public Iterable<Customer> findAll() {
		return customerRespository.findAll();
	}
	@Override
	public Customer findById(Integer id) {
		Optional<Customer> customer = customerRespository.findById(id);
		return customer.get();
	}
	@Override
	public void add(Customer customer) {
		addCustomerCep(customer);
		
	}
	@Override
	public void update(Integer id, Customer customer) {
		Optional<Customer> customerId = customerRespository.findById(id);
		if(customerId.isPresent()) {
			addCustomerCep(customer);
		}
		
	}
	@Override
	public void delete(Integer id) {
		customerRespository.deleteById(id);
	}
	
	
	private void addCustomerCep(Customer customer) {
		String cep = customer.getAndress().getCep();
		Andress andress = andressRepository.findById(cep).orElseGet(() -> {
			Andress newAndress = cepService.searchCEP(cep);
			andressRepository.save(newAndress);
			return newAndress;
		});
		customer.setAndress(andress);
		customerRespository.save(customer);
	}
}
