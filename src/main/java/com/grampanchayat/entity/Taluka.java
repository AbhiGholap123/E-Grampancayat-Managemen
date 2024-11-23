package com.grampanchayat.entity;

import java.util.List;

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
import jakarta.persistence.OneToMany;

@Entity
public class Taluka {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="talukaId")
    private Long talukaId;
    private String talukaName;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id")
    @JsonIgnore
    private District district;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "taluka")
    @JsonIgnore
	private List<Village> village;

	public Long getTalukaId() {
		return talukaId;
	}

	public void setTalukaId(Long talukaId) {
		this.talukaId = talukaId;
	}

	public String getTalukaName() {
		return talukaName;
	}

	public void setTalukaName(String talukaName) {
		this.talukaName = talukaName;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public List<Village> getVillage() {
		return village;
	}

	public void setVillage(List<Village> village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Taluka [talukaId=" + talukaId + ", talukaName=" + talukaName + ", district=" + district + ", village="
				+ village + "]";
	}

	
    
    
    
    
}
