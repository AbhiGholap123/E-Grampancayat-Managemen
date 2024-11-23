package com.grampanchayat.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.services.UserCertificateService;

@RequestMapping("/resident")
public class UserCertiController {
	
//	@Autowired
//	private ResidentCertificateService residentCertificateService;
//	
//	@PostMapping("/info")
//	public ResidentCertificateRegi forResidentCertiRegi(@RequestBody ResidentCertificateRegi object)
//	{
//		return this.residentCertificateService.residentCertiRegi(object);
//	}
}
