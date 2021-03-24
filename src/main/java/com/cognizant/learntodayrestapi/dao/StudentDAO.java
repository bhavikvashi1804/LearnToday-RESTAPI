package com.cognizant.learntodayrestapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.learntodayrestapi.exception.StudentNotFoundException;
import com.cognizant.learntodayrestapi.model.Student;

import java.rmi.StubNotFoundException;
import java.util.*;

@Component
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean saveStudent(Student s) {

		boolean isAdded = false;

		try {
			int noOfRowsUpdated = jdbcTemplate.update("insert into student values (?,?,?)", s.getEnrollmentId(),
					s.getStudentId(), s.getCourseId());

			if (noOfRowsUpdated > 0) {
				isAdded = true;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return isAdded;
	}

	public boolean deleteStudent(int id) throws StudentNotFoundException {

		boolean isDeleted = false;

		try {
			int noOfRowsUpdated = jdbcTemplate.update("delete from student where enrollmentId = ?", id);

			if (noOfRowsUpdated > 0) {
				isDeleted = true;
			} else {
				throw new StudentNotFoundException();
			}
		} catch (StudentNotFoundException e) {
			throw new StudentNotFoundException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return isDeleted;
	}
}
