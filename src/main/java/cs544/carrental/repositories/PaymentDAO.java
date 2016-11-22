package cs544.carrental.repositories;
import org.springframework.data.repository.CrudRepository;

import cs544.carrental.domain.Payment;



public interface PaymentDAO extends CrudRepository<Payment, Integer> {
	

}




