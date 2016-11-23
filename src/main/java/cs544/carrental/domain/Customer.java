package cs544.carrental.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@Size(min = 6, message = "Password should be at least 6 characters long")
	private String password;
	@Size(min = 6, message = "Name should be at least 6 characters long")
	private String name;
	@Size(min = 6, message = "Username should be at least 6 characters long")
	private String username;
	@NotEmpty
	@Email(message = "Invalid email")
	private String email;
	@Size(min = 1, message = "Cannot be empty")
	private String phoneNumber;
	@Valid
	@Embedded
	private Address address;
	private String role="user";

	@Override
	public String toString() {
		return "Customer [id=" + id + ", password=" + password + ", name=" + name + ", username=" + username
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", address=" + address + ", role=" + role
				+ ", car=" + car + ", confirmPassword=" + confirmPassword + "]";
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@OneToOne
	private Car car;

	@Transient
	private String confirmPassword;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
