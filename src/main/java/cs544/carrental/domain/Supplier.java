package cs544.carrental.domain;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("ROLE_SUPPLIER")
public class Supplier extends User{
	
	@OneToMany
	private List<Sales> sales;
	
	public Supplier(){}

	public List<Sales> getSales() {
		return sales;
	}

	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}

	
}
