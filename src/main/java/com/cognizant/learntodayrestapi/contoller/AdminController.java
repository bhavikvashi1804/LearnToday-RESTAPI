package com.cognizant.learntodayrestapi.contoller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.learntodayrestapi.model.Course;
import com.cognizant.learntodayrestapi.service.CourseService;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public ResponseEntity<Object> getAllCourses() {
		List<Course> courses = courseService.getAllCourses();
		if (!courses.isEmpty()) {
			return new ResponseEntity(courses, HttpStatus.OK);
		} else {
			return new ResponseEntity("Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{CourseId}")
	public ResponseEntity<Object> getCourseById(@PathVariable("CourseId") int CourseId) {
		return null;
	}

}
