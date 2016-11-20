package cs544.carrental.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DateRange {
	
	@Id
	@GeneratedValue
	private int id;
	@Temporal(TemporalType.DATE)
	private Date startDate=new Date();
	@Temporal(TemporalType.DATE)
	private Date endDate=new Date();
	
	public DateRange(){}
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	} 
}
