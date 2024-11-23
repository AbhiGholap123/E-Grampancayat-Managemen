package com.grampanchayat.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.entity.UserInfo;
import com.grampanchayat.entity.UserRegistration;
import com.grampanchayat.entity.UserRegistrationModel;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration, Long>{
	
	boolean existsByAadharNumber(String aadharNumber);
	
	//UserRegistration findByAadharNumber(String aadharNumber);
	
	Optional<UserRegistration> findByAadharNumber(String aadharNumber);

	UserCertificateRegi save(UserCertificateRegi residentCertificate); 
	
//	Optional<UserInfo> findByName(String username);
	
//	long getUserAdharNumber(long aadharNumber);

//	UserRegistration save(UserRegistrationModel dupmodel);

}
