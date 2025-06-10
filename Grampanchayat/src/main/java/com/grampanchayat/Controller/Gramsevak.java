package com.grampanchayat.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grampanchayat.entity.MarriedCertificateInfo;
import com.grampanchayat.services.Userservice;

@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
//@CrossOrigin("*")
@Component
public class Gramsevak {

	@Autowired
	private Userservice userservice;
	
	
	@GetMapping("/allrecord")
	public List<MarriedCertificateInfo> getallrecords()
	{
		return (List<MarriedCertificateInfo>) userservice.getallrecords();
	}
	
	@GetMapping("/{brideadharnumber}")
	public Optional<MarriedCertificateInfo> getInfoById(@PathVariable("brideadharnumber") int brideadharnumber)
	{
		Optional<MarriedCertificateInfo> marriedCertificateInfo=userservice.getInfoById(brideadharnumber);
		
		return marriedCertificateInfo;
	}
	
}
