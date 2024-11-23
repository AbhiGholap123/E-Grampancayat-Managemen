package com.grampanchayat.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.entity.State;
import com.grampanchayat.entity.UserRegistration;
import com.grampanchayat.entity.UserRegistrationModel;
import com.grampanchayat.repo.DistrictRepo;
import com.grampanchayat.repo.StateRepo;
import com.grampanchayat.repo.TalukaRepo;
import com.grampanchayat.repo.UserRegistrationRepo;
import com.grampanchayat.repo.VillageRepo;

import ch.qos.logback.core.model.Model;
//import com.jpa.test.entities.User;
//import com.jpa.test.entities.User;

@Service
public class UserRegisterdService {
	
	@Autowired
    private PasswordEncoder encoder;

	@Autowired
	private UserRegistrationRepo userRegistrationRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private DistrictRepo districtRepo;
	
	@Autowired
	private TalukaRepo talukaRepo;
	
	@Autowired
	private VillageRepo villageRepo;
	
	
	public UserRegistration singleuserregistered(UserRegistrationModel model) {
		
		
		
//		UserRegistrationModel dupmodel=new UserRegistrationModel();
		UserRegistration userRegistration=new UserRegistration();
		
		userRegistration.setFirstName(model.getFirstName());
		userRegistration.setMiddleName(model.getMiddleName());
		userRegistration.setLastName(model.getLastName());
		userRegistration.setAadharNumber(model.getAadharNumber());
		userRegistration.setEmail(model.getEmail());
		userRegistration.setPassword(encoder.encode(model.getPassword()));
//		userRegistration.setConfirmPassword(encoder.encode(model.getPassword()));
		userRegistration.setGender(model.getGender());
		
	    userRegistration.setState(stateRepo.findByStateName(model.getStateName()));
	
	    userRegistration.setDistrict(districtRepo.findByDistrictName(model.getDistrictName()));
	    
	    userRegistration.setTaluka(talukaRepo.findByTalukaName(model.getTalukaName()));
	    
	    userRegistration.setVillage(villageRepo.findByVillageName(model.getVillageName()));
	    
		
		return userRegistrationRepo.save(userRegistration);
	}


	public UserRegistration getUserById(Long userId) {
			Optional<UserRegistration> optionalUser = userRegistrationRepo.findById(userId);
			return optionalUser.get();
		}
	
	//New method for getting object by adhar number
	public UserRegistration findUserByAadhar(String aadharNumber) {
		return userRegistrationRepo.findByAadharNumber(aadharNumber).get();
		
	}
	
	//New Method for getting user adhar number
	
	
	
	public List<UserRegistration> getallusers() {
		
		List<UserRegistration> list=(List<UserRegistration>)this.userRegistrationRepo.findAll();
		
		return list;
	}
	
	public boolean isAadharNumberExist(String aadharNumber)
	{
		return this.userRegistrationRepo.existsByAadharNumber(aadharNumber);
	}


	public UserCertificateRegi residentCertiRegistration(UserCertificateRegi residentCertificate) {
		
		return userRegistrationRepo.save(residentCertificate);
	}
	}