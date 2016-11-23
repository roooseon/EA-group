package cs544.carrental;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import cs544.carrental.domain.DateRange;



@SpringBootApplication
@EnableAspectJAutoProxy
public class CarRentalApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(CarRentalApplication.class, args);
		
		
	}
}
