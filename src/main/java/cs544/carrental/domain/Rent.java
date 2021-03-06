package cs544.carrental.domain;


import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Future;

//import cs544.carrental.domain.Car;


import javax.persistence.OneToOne;





@Entity
public class Rent {
	@Id
	@GeneratedValue
	private int rentId;
	
	
	
	//private double rentPerDay;
	
	@Temporal(TemporalType.DATE)
	@Future
	private Date rentedDate;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Future
	private Date returnedDate;
	
	
	
	@OneToOne //(cascade=CascadeType.PERSIST , orphanRemoval = true)
	private Car car;
	
/*	@OneToOne(mappedBy = "rent")
	private Payment payment;
	*/
	
	

	private int totalNoOfDays;
	private double totalAmt;
	
	
		public Rent() {
				
			}


	public int getTotalNoOfDays() {
		return totalNoOfDays;
	}

	public void setTotalNoOfDays(int totalNoOfDays) {
		this.totalNoOfDays = totalNoOfDays;
	}

	public double getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}



	
	
	/*public Rent(double rentPerDay, Date rentedDate, Date returnedDate) {
		
		this.rentId = rentId;
		this.rentPerDay = rentPerDay;
		this.rentedDate = rentedDate;
		this.returnedDate = returnedDate;
	}*/

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

/*	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}*/

	public Date getRentedDate() {
		return rentedDate;
	}

	public void setRentedDate(Date rentedDate) {
		this.rentedDate = rentedDate;
	}

	public Date getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}

	/*public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}*/
	
	
}
