package com.grampanchayat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grampanchayat.entity.Village;

public interface VillageRepo extends JpaRepository<Village, Long>{

	Village  findByVillageName(String villageName);

}
