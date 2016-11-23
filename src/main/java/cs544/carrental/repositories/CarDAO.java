package cs544.carrental.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import cs544.carrental.domain.Car;
import cs544.carrental.domain.CarType;

public interface CarDAO extends CrudRepository<Car, Integer>  {
		@Query("FROM Car c WHERE c.carType= :carType")
		public List<Car> getCarByType(@Param("carType") CarType carType );
	}