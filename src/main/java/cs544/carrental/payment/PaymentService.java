package cs544.carrental.payment;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.Payment;

import cs544.carrental.repositories.PaymentDAO;


@Service
@Transactional
public class PaymentService implements IPaymentService {

	@Autowired
	private PaymentDAO payDAO;
	
	@Override
	public Payment getPayment(int payID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePayment(Payment payment) {
		// TODO Auto-generated method stub
		this.payDAO.save(payment);
	}
	
	

}
