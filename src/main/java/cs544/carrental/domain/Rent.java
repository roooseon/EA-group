package cs544.carrental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Rent {
	@Id
	@GeneratedValue
	private int id;
	private double totalAmount;
	private double rentPerDay;
	@OneToOne
	private DateRange dateRange;
	@OneToOne
	private Car car;
	
	public Rent(){}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public DateRange getDateRange() {
		return dateRange;
	}
	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}
}
