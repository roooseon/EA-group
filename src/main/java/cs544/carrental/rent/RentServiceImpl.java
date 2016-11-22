package cs544.carrental.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import org.springframework.transaction.annotation.Transactional;
import javax.transaction.Transactional;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.Rent;
import cs544.carrental.repositories.RentDAO;

@Service
@Transactional
public class RentServiceImpl implements IRentService {
	
	@Autowired
	RentDAO rentDAO;
	
	@Override
	public Rent getRent(int rentId){
		return this.rentDAO.findOne(rentId);
	}

	@Override
	public void saveRent(Rent rent) {
		
		System.out.println(rent);
		rentDAO.save(rent);
	}
	
	@Override
	public List<Rent> getAllRent() {
		
		// TODO Auto-generated method stub
		return (List<Rent>) rentDAO.findAll();
	}

	
}
