package com.grampanchayat.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grampanchayat.entity.MarriedCertificateInfo;
import com.grampanchayat.services.Userservice;
//import com.jpa.test.entities.User;

@RestController
@EnableAutoConfiguration
@RequestMapping("/minfo")
//@CrossOrigin("*")
@Component
public class GrampanchayatController {
	
	@Autowired
	private Userservice userservice;
	
//	@PostMapping("/city")
//    public ResponseEntity<City> createCity(@RequestBody City city){
//      UserService userService = null;
//		City savedcity = userservice.createCity(city);
//        return new ResponseEntity<>(savedcity, HttpStatus.CREATED);
//    }
	
	@PostMapping("/marriedInfo")
    public ResponseEntity<MarriedCertificateInfo> createMarriedInfo(@RequestBody MarriedCertificateInfo marriedCertificateInfo){
//        UserService userService = null;
		MarriedCertificateInfo savedmarrInfo = userservice.createMarriedInfo(marriedCertificateInfo);
        return new ResponseEntity<>(savedmarrInfo, HttpStatus.CREATED);
    }
	
	
}
