package cs544.carrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import cs544.carrental.domain.DateRange;



@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(CarRentalApplication.class, args);
		
		
	}
}
