package cs544.carrental.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cs544.carrental.domain.Admin;


@Repository("adminRepository")
public interface AdminDAO extends CrudRepository<Admin,Integer>{

}
