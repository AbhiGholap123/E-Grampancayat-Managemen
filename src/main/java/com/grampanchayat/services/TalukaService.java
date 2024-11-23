package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.Taluka;
import com.grampanchayat.repo.DistrictRepo;
import com.grampanchayat.repo.TalukaRepo;

@Service
public class TalukaService {
	
	 @Autowired
	 private TalukaRepo talukaRepo;
	 
	 @Autowired
	 private DistrictRepo districtRepo;

	 public List<Taluka> getTalukaByDistrict(District district)
	 {
		 return talukaRepo.findByDistrict(district);
	 }

	public Taluka getTalukaById(Long talukaId) {
		// TODO Auto-generated method stub
		return this.talukaRepo.findById(talukaId).get();
	}

	public List<Taluka> getTalukasByDistrictName(String districtName) {
		
		District district=districtRepo.findByDistrictName(districtName.toLowerCase());
		
		return district.getTaluka();
	}


}
