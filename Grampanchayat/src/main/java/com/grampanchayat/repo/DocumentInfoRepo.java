package com.grampanchayat.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampanchayat.entity.DocumentInfo;

public interface DocumentInfoRepo extends JpaRepository<DocumentInfo, Long>{

//	DocumentInfo findAllById(Long documentId);
	
	//public DocumentInfo findByDocumentId(Long documentId);
	
//	public Optional<DocumentInfo> findById(Long id);

}
