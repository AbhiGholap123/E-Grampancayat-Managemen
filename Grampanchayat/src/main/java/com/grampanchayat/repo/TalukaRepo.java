package com.grampanchayat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.Taluka;

public interface TalukaRepo extends JpaRepository<Taluka, Long>{

	List<Taluka> findByDistrict(District district);

	Taluka getAllVillagesByTalukaName(String talukaName);
	
	Taluka findByTalukaName(String talukaName);
	
	

}
