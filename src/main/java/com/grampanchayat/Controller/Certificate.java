package com.grampanchayat.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin
public class Certificate {
	
	@GetMapping("/applyForCertificate")
	public String applyForCertificate(String aadharNumber,String certificateType)
	{
		return "XVAJXVJ";
	}

}
