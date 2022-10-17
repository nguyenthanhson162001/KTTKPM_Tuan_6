
package net.guides.springboot2.springboot2jpacrudexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.guides.springboot2.springboot2jpacrudexample.model.Plane;

@Repository
@Service
public interface PlaneRepository extends JpaRepository<Plane, Long>{

	@Query(value="SELECT * FROM maybay ",nativeQuery = true)
	List<Plane> findPlanesGoToDalat();
}
