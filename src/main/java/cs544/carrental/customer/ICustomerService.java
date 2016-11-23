package cs544.carrental.customer;

import java.util.List;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.Customer;

public interface ICustomerService {
	 public List<Customer> getAllCustomer();
	 public Customer getCustomerById(int id);
	 public void addCustomer(Customer customer);
	 public void updateCustomer(int id);
	 public void deleteCustomer(int id);
	 public Customer getCustomerByUserName(String userName);
}
