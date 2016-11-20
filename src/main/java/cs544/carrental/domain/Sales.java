package cs544.carrental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sales {
	@Id
	@GeneratedValue
	private int id;
	private double totalAmount;
	
	
	
	
	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Sales(){}
}
