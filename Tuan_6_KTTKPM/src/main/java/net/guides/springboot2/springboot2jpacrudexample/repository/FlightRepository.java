package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import net.guides.springboot2.springboot2jpacrudexample.model.Flight;
import net.guides.springboot2.springboot2jpacrudexample.model.Plane;

@Repository
@Service
public interface FlightRepository extends JpaRepository<Flight, Long>{
	
	@Query(value="SELECT * FROM chuyenbay where ga_den = ?1 ",nativeQuery = true)
	List<Flight> findFlightGoToArrivals(String gaGen);
}

