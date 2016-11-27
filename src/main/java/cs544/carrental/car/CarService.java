package cs544.carrental.car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.CarType;
import cs544.carrental.domain.Status;
import cs544.carrental.repositories.CarDAO;

@Service
@Transactional
public class CarService implements ICarService{
	
	@Autowired
	private CarDAO cardao;
	

	@Override
	public Car addCar(Car car) {
		return cardao.save(car);
	}

	@Override
	public void deleteCar(int id) {
		cardao.delete(id);
	}

	@Override
	public Car getCarById(int id) {
		return cardao.findOne(id);
	}

	@Override
	public List<Car> getAllCar() {
		
		// TODO Auto-generated method stub
		return (List<Car>) cardao.findAll();
	}
	
	
	@Override
	public List<Car>getAvailableCars(){
		List<Car> allCars =  (List<Car>) cardao.findAll();
		List<Car> avaialbleCars  = new ArrayList<Car>(); 
		/*Iterator it = allCars.iterator();

		while(it.hasNext()){
		 Car car =(Car) it.next() ;
		 if (car.getStatus() == Status.AVAILABLE)
			 avaialbleCars.add(car);
		}*/
		
		for(Car c: allCars){
			if(c.getStatus().equals(Status.AVAILABLE)){
				avaialbleCars.add(c);
			}
		}
		return avaialbleCars ;
	}


	public List<Car>getRentedCars(){
		List<Car> allCars =  (List<Car>) cardao.findAll();
		List<Car> rentedCars  = new ArrayList<Car>(); 
		/*Iterator it = allCars.iterator();

		while(it.hasNext()){
		 Car car =(Car) it.next() ;
		 if (car.getStatus() == Status.AVAILABLE)
			 avaialbleCars.add(car);
		}*/
		
		for(Car c: allCars){
			if(c.getStatus().equals(Status.RENTED)){
				rentedCars.add(c);
			}
		}
		return rentedCars ;
	}

	/*@Override
	public List<Car> getSedanCars() {
		
		List<Car> allCars =  (List<Car>) cardao.findAll();
		List<Car> sedanCars  = new ArrayList<Car>(); 

		
		for(Car c: allCars){
			if(c.getCarType().equals(CarType.SEDAN) && c.getStatus().equals(Status.AVAILABLE)){
				sedanCars.add(c);
			}
		}
	
		return sedanCars ;
	}*/
	
	@Override
	public List<Car> getSedanCars(CarType type) {
		List<Car> sedanCars = (List<Car>) cardao.getCarByType(type);
		return sedanCars;
	}


	
	@Override
	public List<Car> getHatchbackCars() {
		List<Car> allCars =  (List<Car>) cardao.findAll();
		List<Car> hatchbackCars  = new ArrayList<Car>(); 

		for(Car c: allCars){
			if(c.getCarType().equals(CarType.HATCHBACK) && c.getStatus().equals(Status.AVAILABLE)){
				hatchbackCars.add(c);
			}
		}
		return hatchbackCars ;
	}

	@Override
	public List<Car> getCoupeCars() {
		List<Car> allCars =  (List<Car>) cardao.findAll();
		List<Car> coupeCars  = new ArrayList<Car>(); 

		for(Car c: allCars){
			if(c.getCarType().equals(CarType.COUPE) && c.getStatus().equals(Status.AVAILABLE)){
				coupeCars.add(c);
			}
		}
		return coupeCars ;
	}

	

	

}
