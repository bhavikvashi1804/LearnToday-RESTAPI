package com.cognizant.learntodayrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.CourseDAO;
import com.cognizant.learntodayrestapi.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseDAO courseDAO;

	public List<Course> getAllCourses() {
		return courseDAO.getAllCourses();
	}

	public List<Course> getAllCoursesSortByStartDate() {
		return courseDAO.getAllCoursesSortByStartDate();
	}

	public Course getCourseById() {
		return courseDAO.getCourseById();
	}

}
