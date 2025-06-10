package com.grampanchayat.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grampanchayat.entity.District;
import com.grampanchayat.entity.State;
import com.grampanchayat.entity.Taluka;
import com.grampanchayat.entity.Village;
import com.grampanchayat.services.DistrictService;
import com.grampanchayat.services.LocationService;
import com.grampanchayat.services.StateService;
import com.grampanchayat.services.TalukaService;
import com.grampanchayat.services.VillageService;

@RestController
@RequestMapping("/api")
//@CrossOrigin
public class LocationController {
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private DistrictService districtService;
	
	@Autowired
	private TalukaService talukaService;
	
	@Autowired
	private VillageService villageService;
	
	@Autowired
    private LocationService locationService;

    @PostMapping("/state")
    public State createState(@RequestBody State state) {
        return locationService.saveState(state);
    }

    @PostMapping("/districts")
    public District createDistrict(@RequestBody District district) {
        return locationService.saveDistrict(district);
    }

    @PostMapping("/talukas")
    public Taluka createTaluka(@RequestBody Taluka taluka) {
        return locationService.saveTaluka(taluka);
    }

    @PostMapping("/villages")
    public Village createVillage(@RequestBody Village village) {
        return locationService.saveVillage(village);
    }

   

    @GetMapping("/districts")
    public List<District> getAllDistricts() {
        return locationService.getAllDistricts();
    }

    @GetMapping("/talukas")
    public List<Taluka> getAllTalukas() {
        return locationService.getAllTalukas();
    }

    @GetMapping("/villages")
    public List<Village> getAllVillages() {
        return locationService.getAllVillages();
    }
    
//    ======================================================
    
    
//    @GetMapping("/districts/{stateId}")
//    public List<District> getDistrictsByState(@PathVariable Long stateId) {
//        State state = stateService.getStateById(stateId);
//        return districtService.getDistrictsByState(state);
//    }
//
//    @GetMapping("/talukas/{districtId}")
//    public List<Taluka> getTehsilsByDistrict(@PathVariable Long districtId) {
//        District district=districtService.getDistrictById(districtId);
//        return talukaService.getTalukaByDistrict(district);
//    }
//
//    @GetMapping("/villages/{talukaId}")
//    public List<Village> getAllVillages(@PathVariable Long talukaId) {
//    	
//    	List<Village> villageByTaluka=villageService.getvillageByTalukaId(talukaId);
//    	return villageByTaluka;
//    }
    
    @GetMapping("/states")
    public List<State> getAllStates() {
        return locationService.getAllStates();
    }
    
    @GetMapping("/districts/{stateName}")
    public List<District> getAllDistricts(@PathVariable String stateName){
    	List<District> districtsByStateName = districtService.getDistrictsByStateName(stateName);
    	return districtsByStateName;
    }
    
    @GetMapping("/talukas/{districtName}")
    public List<Taluka> getAllTalukas(@PathVariable String districtName){
    	List<Taluka> talukaByDistrictName =talukaService.getTalukasByDistrictName(districtName);
    	return talukaByDistrictName;
    }
    
    @GetMapping("/villages/{talukaName}")
    public List<Village> getAllVillages(@PathVariable String talukaName){
    	List<Village> VillageByTalukaName = villageService.getVillagesByTalukaName(talukaName);
    	return VillageByTalukaName;
    }
    
//    single record by name
    @GetMapping("/Singledistrict/{statename}")
    public District getDistrict(@PathVariable String stateName){
    	District districtByStateName = districtService.getDistrictByStateName(stateName);
    	return districtByStateName;
    }
}
