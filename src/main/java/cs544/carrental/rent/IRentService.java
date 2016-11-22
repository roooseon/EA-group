package cs544.carrental.rent;

import java.util.List;

import cs544.carrental.domain.Rent;

public interface IRentService {
	
	public Rent getRent(int rentId);
	public void saveRent(Rent rent);
	public List<Rent> getAllRent();
	

}
