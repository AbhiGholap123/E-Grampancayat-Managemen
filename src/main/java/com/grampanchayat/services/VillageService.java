package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.Taluka;
import com.grampanchayat.entity.Village;
import com.grampanchayat.repo.TalukaRepo;
import com.grampanchayat.repo.VillageRepo;

@Service
public class VillageService {
	
	@Autowired
    private VillageRepo villageRepo;
	
	@Autowired
	private TalukaRepo talukaRepo;

//	public List<Village> getvillageByTalukaId(Long talukaId) {
//		// TODO Auto-generated method stub
//		return villageRepo.findByTaluka(talukaId);
//	}

	public List<Village> getVillagesByTalukaName(String talukaName) {
		Taluka taluka= talukaRepo.getAllVillagesByTalukaName(talukaName.toLowerCase());
		return taluka.getVillage();
	}

//    public List<Village> getVillagesByTaluka(Long taluka)
//    {
//        return this.villageRepo.findByTaluka(taluka);
//    }
}
