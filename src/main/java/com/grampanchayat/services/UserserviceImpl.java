package com.grampanchayat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.grampanchayat.entity.MarriedCertificateInfo;

import com.grampanchayat.repo.MarriedRepo;

//import com.jpa.test.entities.User;

@Service
public class UserserviceImpl implements Userservice{
	
	@Autowired
	public MarriedRepo marriedRepo;
//	public CityRepo cityRepo;
	
	
//	public TahsilRepo tahsilRepo;
	
//	@Override
//	public City createCity(City city) {
//		
//		return cityRepo.save(city);
//	}
	
	@Override
	public MarriedCertificateInfo createMarriedInfo(MarriedCertificateInfo marriedCertificateInfo)
	{
		return marriedRepo.save(marriedCertificateInfo);
		
	}


	@Override
	public List<MarriedCertificateInfo> getallrecords() {
		
		return (List<MarriedCertificateInfo>) marriedRepo.findAll();
	}


	@Override
	public Optional<MarriedCertificateInfo> getInfoById(int brideadharnumber) {
		
		return marriedRepo.findById(brideadharnumber);
	}


//	Optional<MarriedCertificateInfo> optionalUser=
	
//	optionalUser.get()
	
	
	
	

}
