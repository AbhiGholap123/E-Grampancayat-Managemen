package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.DocumentInfo;
import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.repo.DocumentInfoRepo;
import com.grampanchayat.repo.UserCertificateRepo;

@Service
public class UserCertificateService {
	
	@Autowired
	private UserCertificateRepo residentCertificateRepo;
	
//	@Autowired
//	private DocumentInfoRepo documentInfoRepo;
	

	public UserCertificateRegi residentCertiRegi(UserCertificateRegi object) {
		
		return this.residentCertificateRepo.save(object);
		
	}


	public List<UserCertificateRegi> getRegisterUser(String aadharNumber) {
		
		 List<UserCertificateRegi>  certificateRegis = this.residentCertificateRepo.findAllByAadharNumber(aadharNumber);
		 return certificateRegis;
	}


	public UserCertificateRegi getSingleUserDetail(Long id) {
		
		return this.residentCertificateRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}


	public List<UserCertificateRegi> getAllUsers() {
		// TODO Auto-generated method stub
		return this.residentCertificateRepo.findAll();
	}


//	public DocumentInfo updateuser(Long id, String document_status, String Approved) {
//		
//		DocumentInfo temp=documentInfoRepo.getSingleUserById(id);
//		
//		temp.setDocumentStatus(Approved);
//
//		
//		return documentInfoRepo.save(temp);
//	}


//	public UserCertificateRegi updateUserColumn(Long documentId, String document_status, String approved) {
//		
//		UserCertificateRegi userCertificateRegi=residentCertificateRepo.findById(documentId).orElseThrow();
//			
//		userCertificateRegi.getDocumentInfo().setDocumentStatus(approved);
//		
//		return residentCertificateRepo.save(userCertificateRegi);
//	}


	
	
	
}
