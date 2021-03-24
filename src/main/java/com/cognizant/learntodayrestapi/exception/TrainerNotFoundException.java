package com.cognizant.learntodayrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Trainer not found")
public class TrainerNotFoundException extends Exception {

	public TrainerNotFoundException() {
		super("Trainer not found");
	}

}
