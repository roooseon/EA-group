package cs544.carrental.customer;

//import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cs544.carrental.domain.Customer;
import cs544.carrental.repositories.CustomerDAO;

public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> getAllCustomer() {
		
		return (List<Customer>) customerDAO.findAll();
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDAO.findOne(id);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDAO.save(customer);
		
	}

	@Override
	public void updateCustomer(int id) {
		Customer c=customerDAO.findOne(id);
		customerDAO.save(c);
	}

	
}
