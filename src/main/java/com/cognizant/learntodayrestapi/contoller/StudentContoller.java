package com.cognizant.learntodayrestapi.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Student")
public class StudentContoller {

	@GetMapping
	public ResponseEntity<Object> getAllCourses() {
		return null;
	}

	@PostMapping
	public ResponseEntity<Object> postStudent() {
		return null;
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudentEnrollment(@PathVariable("id") int id) {
		return null;
	}
}
