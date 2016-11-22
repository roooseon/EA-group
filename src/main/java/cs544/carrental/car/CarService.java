package cs544.carrental.car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.carrental.domain.Car;
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
		Iterator it = allCars.iterator();

		while(it.hasNext()){
		 Car car =(Car) it.next() ;
		 if (car.getStatus() == Status.AVAILABLE)
			 avaialbleCars.add(car);
		}
		return avaialbleCars ;
	}

}
