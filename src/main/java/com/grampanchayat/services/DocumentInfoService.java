package com.grampanchayat.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.DocumentInfo;
import com.grampanchayat.entity.UserCertificateRegi;
import com.grampanchayat.repo.DocumentInfoRepo;
import com.grampanchayat.repo.UserCertificateRepo;

@Service
public class DocumentInfoService {
	
	@Autowired
	private DocumentInfoRepo documentInfoRepo;
	
	@Autowired
	private UserCertificateRepo userCertificateRepo;
	
	

	public DocumentInfo updateDocStatus(Long id, DocumentInfo documentInfoNew) {
		
		//String Approved="approve";
		UserCertificateRegi userCertificateRegi = userCertificateRepo.findById(id).get();
		
		DocumentInfo documentInfo=
				documentInfoRepo.findById(userCertificateRegi.getDocumentInfo().getDocumentId()).get();
		
		documentInfo.setDocumentStatus(documentInfoNew.getDocumentStatus());
		
		documentInfoRepo.save(documentInfo);
		
		return documentInfo;
	}
	
	
//	public DocumentInfo updateuser(Long documentId, String document_status, String Approved) {
//		
//		DocumentInfo temp=documentInfoRepo.findAllById(documentId);
//		
//		temp.setDocumentStatus(Approved);
//
//		
//		return documentInfoRepo.save(temp);
//	}

}
