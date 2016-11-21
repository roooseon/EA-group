package cs544.carrental.domain;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Car {

	
	@Id
	@GeneratedValue
	private int id;
	private String company;
	private String model;
	private int builtYear;
	private String number;
	private int seat;
	private int dailyRent;
	
	
	
	@OneToOne(mappedBy ="car")
	private Rent rent;

	@Enumerated(EnumType.STRING)
	private Status status;
		
	@Enumerated(EnumType.STRING)
	private CarType carType;
	
	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}	
	
	@Lob
	private byte[] image;
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getBuiltYear() {
		return builtYear;
	}

	public void setBuiltYear(int builtyear) {
		this.builtYear = builtyear;
	}

	

	public Car() {
	}

	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CarType getType() {
		return carType;
	}

	public void setType(CarType type) {
		this.carType = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public int getDailyRent() {
		return dailyRent;
	}

	public void setDailyRent(int dailyRent) {
		this.dailyRent = dailyRent;
	}
}
