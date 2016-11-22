package cs544.carrental.payment;

import cs544.carrental.domain.Payment;


public interface IPaymentService {
	
	public Payment getPayment(int payID);
	public void savePayment(Payment payment);
	


}
