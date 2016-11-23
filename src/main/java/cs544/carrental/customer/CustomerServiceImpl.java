package cs544.carrental.customer;

//import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import cs544.carrental.domain.Customer;
import cs544.carrental.repositories.CustomerDAO;

@Service
@Transactional
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

	@Override
	public void deleteCustomer(int id) {
		customerDAO.delete(id);
		
	}

	@Override
	public Customer getCustomerByUserName(String userName) {
		return customerDAO.findByUsername(userName);
		
	}
	
	

	
	
	
}
