package com.cognizant.learntodayrestapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.learntodayrestapi.model.Student;

import java.util.*;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean saveStudent(Student s) {
		return false;
	}

	public boolean deleteStudent(int id) {
		return false;
	}
}
