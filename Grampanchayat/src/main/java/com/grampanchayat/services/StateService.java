package com.grampanchayat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grampanchayat.entity.State;
import com.grampanchayat.repo.StateRepo;

@Service
public class StateService {
	
	@Autowired
	private StateRepo stateRepo;
	
	public List<State> getAllStates()
	{
		return stateRepo.findAll();
	}

	public State getStateById(Long stateId) {
		// TODO Auto-generated method stub
		return stateRepo.getById(stateId);
	}
}
