package cs544.carrental.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cs544.carrental.domain.Customer;

@Repository("customerRepository")
public interface CustomerDAO extends CrudRepository<Customer, Integer>{

	public Customer findByUsername(String userName);
	}