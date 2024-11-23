package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.State;
import com.grampanchayat.entity.Taluka;
import com.grampanchayat.entity.Village;
import com.grampanchayat.repo.DistrictRepo;
import com.grampanchayat.repo.StateRepo;
import com.grampanchayat.repo.TalukaRepo;
import com.grampanchayat.repo.VillageRepo;

@Service
public class LocationService {
	
	@Autowired
	private StateRepo stateRepo;
	    
	@Autowired
	private DistrictRepo districtRepo;
	    
	@Autowired
	private TalukaRepo talukaRepo;
	    
	@Autowired
	private VillageRepo villageRepo;
	
	public State saveState(State state)
	{
		return stateRepo.save(state);
	}

	public District saveDistrict(District district) {
        return districtRepo.save(district);
    }

	public Taluka saveTaluka(Taluka taluka) {
        return talukaRepo.save(taluka);
    }

//	public Village saveVillage(Village village) {
//        return villageRepo.save(village);
//    }

	//==========================================
	public List<State> getAllStates() {
        return stateRepo.findAll();
    }

    public List<District> getAllDistricts() {
        return districtRepo.findAll();
    }

    public List<Taluka> getAllTalukas() {
        return talukaRepo.findAll();
    }

    public List<Village> getAllVillages() {
        return villageRepo.findAll();
    }

	public Village saveVillage(Village village) {
		// TODO Auto-generated method stub
		return villageRepo.save(village);
	}
}
