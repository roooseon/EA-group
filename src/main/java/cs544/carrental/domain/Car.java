package cs544.carrental.domain;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class Car {

	@Id
	@GeneratedValue
	private int id;
	@NotEmpty
	private String company;
	@NotEmpty
	private String model;
	@Range(min = 1970, max = 2016)
	private int builtYear;
	@Override
	public String toString() {
		return "Car [id=" + id + ", company=" + company + ", model=" + model + ", builtYear=" + builtYear + ", number="
				+ number + ", seat=" + seat + ", dailyRent=" + dailyRent + ", image=" + Arrays.toString(image)
				+ ", tempImg=" + tempImg + ", status=" + status + ", carType=" + carType + "]";
	}

	@NotEmpty
	private String number;
	@Min(value=1)
	private int seat;
	
	@Min(value=1)
	private int dailyRent;

	@Lob
	private byte[] image;
	
	@Transient
	private MultipartFile tempImg;

	public MultipartFile getTempImg() {
		return tempImg;
	}

	public void setTempImg(MultipartFile tempImg) {
		this.tempImg = tempImg;
	}
	/*@OneToOne(mappedBy = "car")
	private Rent rent;*/
	
	@Enumerated(EnumType.STRING)
	private Status status;

	@Enumerated(EnumType.STRING)
	private CarType carType;

	public Car() {
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

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

/*	public Rent getRent() {
		return rent;
	}

	public void setRent(Rent rent) {
		this.rent = rent;
	}*/

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
