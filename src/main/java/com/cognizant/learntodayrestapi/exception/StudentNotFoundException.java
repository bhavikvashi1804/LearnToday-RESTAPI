package com.cognizant.learntodayrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Student not found")
public class StudentNotFoundException extends Exception {
	
	
	public StudentNotFoundException() {
		super("Student not found");
	}

}
