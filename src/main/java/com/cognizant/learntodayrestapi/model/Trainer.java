package com.cognizant.learntodayrestapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trainer {

	// properties
	@JsonProperty(value = "TrainerId", index = 0)
	private int trainerId;
	@JsonProperty(value = "Password", index = 1)
	private String password;

	// getters and setters
	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// constructor
	public Trainer() {

	}

	public Trainer(int trainerId, String password) {
		this.trainerId = trainerId;
		this.password = password;
	}

}
