package cs544.carrental.repositories;

import org.springframework.data.repository.CrudRepository;

import cs544.carrental.domain.Rent;

public interface RentDAO extends CrudRepository<Rent, Integer> {

}
