package com.test.vehicle;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface vehiclerepo extends CrudRepository<vehiclepojo, Integer> {

	@Query(value = "SELECT * FROM vehiclepojo WHERE type=? ", nativeQuery = true)
	public List<vehiclepojo> findByType(String type);

	@Query(value = "SELECT * FROM vehiclepojo WHERE idv = ?", nativeQuery = true)
	public Optional<vehiclepojo> findAllById(int idv);

	@Query(value = "DELETE FROM vehiclepojo WHERE idv = ?;", nativeQuery = true)
	public void deleteAll(int idv);

	public vehiclepojo findByIdv(int idv);

	 @Query(value="SELECT * FROM vehiclepojo WHERE idv not in (select idv from bookingvehicle  WHERE startdate <= ?1 AND enddate >= ?2);" ,nativeQuery = true)
		public List<vehiclepojo> notbooked(Date startdate, Date enddate);

		
		
		
		
		
		
	
}
