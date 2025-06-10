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
import jakarta.persistence.OneToMany;

@Entity
public class State {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stateId")
    private Long stateId;
    
	private String stateName;
    
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "state")
	@JsonIgnore
    private List<District> district;

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<District> getDistrict() {
		return district;
	}

	public void setDistrict(List<District> district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + ", district=" + district + "]";
	}

	
	
    
	
    
	
    
}
