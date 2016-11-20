package cs544.carrental.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cs544.carrental.domain.Car;

@Repository
//@Transactional(propagation=Propagation.REQUIRED)


public interface CarDAO extends CrudRepository<Car, Integer>  {

	}