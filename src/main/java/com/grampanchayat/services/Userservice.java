package com.grampanchayat.services;

import java.util.List;
import java.util.Optional;


import com.grampanchayat.entity.MarriedCertificateInfo;

public interface Userservice {

//	City createCity(City city);

	public MarriedCertificateInfo createMarriedInfo(MarriedCertificateInfo marriedCertificateInfo);
	
	public List<MarriedCertificateInfo> getallrecords();

	public Optional<MarriedCertificateInfo> getInfoById(int brideadharnumber);
}
