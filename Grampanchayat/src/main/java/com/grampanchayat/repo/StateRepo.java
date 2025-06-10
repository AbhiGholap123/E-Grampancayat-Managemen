package com.grampanchayat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.State;
import com.grampanchayat.entity.UserRegistration;

public interface StateRepo extends JpaRepository<State, Long>{

	State findByStateName(String stateName);

	State findSingleByStateName(String stateName);

	//State getstateName(String stateName);
	
	
	
	

}
