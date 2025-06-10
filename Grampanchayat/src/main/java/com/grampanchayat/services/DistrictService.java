package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.State;
import com.grampanchayat.repo.DistrictRepo;
import com.grampanchayat.repo.StateRepo;

@Service
public class DistrictService {
	
	 @Autowired
	 private DistrictRepo districtRepo;
	 
	 @Autowired
	 private StateRepo stateRepo;

	 public List<District> getDistrictsByStateName(String stateName)
	 {
		 State state = stateRepo.findByStateName(stateName.toLowerCase());
		 return state.getDistrict();
	 }

	public District getDistrictById(Long districtId) {
		// TODO Auto-generated method stub
		return this.districtRepo.findById(districtId).get();
	}

	public District getDistrictByStateName(String stateName) {
		
		 State state = stateRepo.findSingleByStateName(stateName.toLowerCase());
		return (District) state.getDistrict();
		
	}
}
