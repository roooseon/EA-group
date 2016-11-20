package cs544.carrental.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ROLE_COSTUMER")
public class Customer extends User {
	
	public Customer(){
		
	}
}
