package com.cognizant.learntodayrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.TrainerDAO;
import com.cognizant.learntodayrestapi.model.Trainer;

@Service
public class TrainerService {

	@Autowired
	private TrainerDAO trainerDAO;

	public boolean trainerSignUp(Trainer trainer) {
		return trainerDAO.trainerSignUp(trainer);
	}

	public boolean updatePassword(int id, Trainer trainer) {
		return updatePassword(id, trainer);
	}

}
