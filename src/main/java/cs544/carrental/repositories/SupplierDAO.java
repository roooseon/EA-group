package cs544.carrental.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cs544.carrental.domain.Supplier;

@Repository("supplierRepository")
public interface SupplierDAO extends JpaRepository<Supplier, Integer> {

	
}
