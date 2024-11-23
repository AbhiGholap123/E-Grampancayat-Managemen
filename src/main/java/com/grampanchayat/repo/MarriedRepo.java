package com.grampanchayat.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.grampanchayat.entity.MarriedCertificateInfo;

public interface MarriedRepo extends CrudRepository<MarriedCertificateInfo,Integer>{

//	Optional<MarriedCertificateInfo> findById(Long brideadharnumber);

//	Optional<MarriedCertificateInfo> findById(Long id);

}
