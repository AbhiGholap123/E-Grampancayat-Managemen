package com.grampanchayat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampanchayat.entity.UserCertificateRegi;

public interface UserCertificateRepo extends JpaRepository<UserCertificateRegi,Long>{

//	UserCertificateRegi findAllById(Long userId);

//	UserCertificateRegi getAll();
	
	public List<UserCertificateRegi> findAllByAadharNumber(String aadharNumber);

}
