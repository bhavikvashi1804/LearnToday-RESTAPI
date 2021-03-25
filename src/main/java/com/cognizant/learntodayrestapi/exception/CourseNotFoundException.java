package com.cognizant.learntodayrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Course not found")
public class CourseNotFoundException  extends Exception{
	
	public CourseNotFoundException() {
		super("Course not found");
	}
}
