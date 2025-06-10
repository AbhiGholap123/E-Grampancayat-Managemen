package com.grampanchayat.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.entity.UserRegistration;
import com.grampanchayat.entity.UserRegistrationModel;
import com.grampanchayat.services.UserRegisterdService;

import ch.qos.logback.core.model.Model;
//import com.jpa.test.entities.User;

@RestController
@RequestMapping("/normaluser")
//@CrossOrigin("*")
public class UserRegistrationController {

	@Autowired
	private UserRegisterdService userRegisterdService;
	
	
	
	@GetMapping("/checkAadhar/{adharnumber}")
	public boolean isAadharNumberExist(@PathVariable("adharnumber") String aadharNumber)
	{
		return this.userRegisterdService.isAadharNumberExist(aadharNumber);
	}
	
	@PostMapping("/registerUser")
	public UserRegistration registerUser(@RequestBody UserRegistrationModel model)
	{
		return userRegisterdService.singleuserregistered(model);
	}
//		
	@GetMapping("{aadharNumber}")
	public ResponseEntity<UserRegistration> getsingleuser(@PathVariable("aadharNumber") Long userId)
	{
		UserRegistration userRegistration =userRegisterdService.getUserById(userId);
		 
		if(userRegistration==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else {
			return ResponseEntity.of(Optional.of(userRegistration));
		}
	}
	
//	Get user by Adhar Number
	@GetMapping("/ByAdharNumber/{AdharNumber}")
	public UserRegistration getUserByAdhar(@PathVariable("AdharNumber")String aadharNumber)
	{
		UserRegistration userRegistration=userRegisterdService.findUserByAadhar(aadharNumber);
		
		return userRegistration;
		    
	}
	
//	@GetMapping("/registerusers")
//	public ResponseEntity<List<UserRegistration>> getallusers()
//	{
//		List<UserRegistration> list=this.userRegisterdService.getallusers();
//		if(list.size()<=0)
//		{
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//		}
//		return ResponseEntity.status(HttpStatus.CREATED).body(list);
//	}
	
	
	
	@PostMapping("/resiCertiRegi")
	public UserCertificateRegi residentCertificateRegistration(@RequestBody UserCertificateRegi residentCertificate)
	{
		return this.userRegisterdService.residentCertiRegistration(residentCertificate);
	}
	
	
}
