package cs544.carrental;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@EnableAspectJAutoProxy
public class CarRentalApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(CarRentalApplication.class, args);
		
		
	}
}
