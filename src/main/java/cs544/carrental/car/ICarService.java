package cs544.carrental.car;

import java.util.List;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.CarType;

public interface ICarService {
	public Car addCar(Car car);
	public void deleteCar(int id);
	public Car getCarById(int id);
	public List<Car> getAllCar();
	public List<Car> getAvailableCars();
	//public List<Car> getSedanCars();
	public List<Car> getHatchbackCars();
	public List<Car> getCoupeCars();
	public List<Car> getSedanCars(CarType type);
}
