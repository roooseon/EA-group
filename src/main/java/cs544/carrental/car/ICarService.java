package cs544.carrental.car;

import java.util.List;

import cs544.carrental.domain.Car;

public interface ICarService {
	public void addCar(Car car);
	public void deleteCar(int id);
	public Car getCarById(int id);
	public List<Car> getAllCar();
}
