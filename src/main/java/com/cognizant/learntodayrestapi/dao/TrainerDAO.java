package com.cognizant.learntodayrestapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.learntodayrestapi.exception.TrainerNotFoundException;
import com.cognizant.learntodayrestapi.model.Trainer;

@Component
public class TrainerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean trainerSignUp(Trainer trainer) {
		boolean isTrainerAdded = false;

		try {
			int noOfRowsUpdated = jdbcTemplate.update("insert into Trainer values (?,?) ", trainer.getTrainerId(),
					trainer.getPassword());
			if (noOfRowsUpdated > 0) {
				isTrainerAdded = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return isTrainerAdded;
	}

	public boolean updatePassword(int id, Trainer trainer) throws TrainerNotFoundException {
		boolean isPasswordUpdated = false;
		try {
			int noOfRowsUpdated = jdbcTemplate.update("update trainer set password = ? where trainerId = ?",
					trainer.getPassword(), id);

			if (noOfRowsUpdated > 0) {
				isPasswordUpdated = true;
			} else {
				throw new TrainerNotFoundException();
			}
		} catch (TrainerNotFoundException e) {
			throw new TrainerNotFoundException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return isPasswordUpdated;
	}

}
