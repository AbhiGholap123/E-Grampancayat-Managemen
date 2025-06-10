package com.grampanchayat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Village {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long villageId;
	
    private String villageName;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "taluka_id")
    @JsonIgnore
    private Taluka taluka;
    

	public Long getVillageId() {
		return villageId;
	}

	public void setVillageId(Long villageId) {
		this.villageId = villageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public Taluka getTaluka() {
		return taluka;
	}

	public void setTaluka(Taluka taluka) {
		this.taluka = taluka;
	}

	@Override
	public String toString() {
		return "Village [villageId=" + villageId + ", villageName=" + villageName + ", taluka=" + taluka + "]";
	}
    
    
    
    
    
}
