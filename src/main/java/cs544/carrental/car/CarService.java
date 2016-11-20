package cs544.carrental.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import cs544.carrental.domain.Car;
import cs544.carrental.repositories.CarDAO;

public class CarService implements ICarService{
	
	@Autowired
	CarDAO cardao;
	

	@Override
	public void addCar(Car car) {
		cardao.save(car);
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
		return (List<Car>) cardao.findAll();
	}

}
