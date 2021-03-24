package com.cognizant.learntodayrestapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.learntodayrestapi.model.Trainer;

@Component
public class TrainerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean trainerSignUp(Trainer trainer) {
		boolean isTrainerAdded = false;

		return isTrainerAdded;
	}

	public boolean updatePassword(int id, Trainer trainer) {
		boolean isPasswordUpdated = false;

		return isPasswordUpdated;
	}

}
