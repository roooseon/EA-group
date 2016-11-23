package cs544.carrental.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue
	private int payID;
	
	@Enumerated(EnumType.STRING)
	private CCType cctype;
	
	

	@NotNull
	//@Size(min=9 , max = 15 , message = "Must be between 9 to 15 characters")
	private long creditCardNo;
	@NotNull
	//@Size(min=3 , max=3)
	private int cVV;
	
	@OneToOne
	private Rent rent;
	


	public CCType getCctype() {
		return cctype;
	}

	public void setCctype(CCType cctype) {
		this.cctype = cctype;
	}

	
	public int getPayID() {
		return payID;
	}

	public void setPayID(int payID) {
		this.payID = payID;
	}

	public long getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(long creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public int getcVV() {
		return cVV;
	}

	public void setcVV(int cVV) {
		this.cVV = cVV;
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}
	
	
  

}
