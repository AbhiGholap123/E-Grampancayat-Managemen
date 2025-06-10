package com.grampanchayat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.State;

public interface DistrictRepo extends JpaRepository<District, Long>{

	District findByDistrictName(String lowerCase);

//	@Query(value = "SELECT * FROM district where state_id=?1", nativeQuery = true)
//	List<District> findByState(Long stateId);
	//List<District> findByName(String stateName);

		

}
