package com.cognizant.learntodayrestapi.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<Object> handleStudentNotFound() {
		Map<String, String> map = new HashMap<>();
		map.put("Message", "No enrollement information found");
		return new ResponseEntity(map, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(TrainerNotFoundException.class)
	public ResponseEntity<Object> handleTrainerNotFound() {
		Map<String, String> map = new HashMap<>();
		map.put("Message", "Searched Data is not found");
		return new ResponseEntity(map, HttpStatus.NOT_FOUND);
	}

}
