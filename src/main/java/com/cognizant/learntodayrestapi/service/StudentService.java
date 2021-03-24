package com.cognizant.learntodayrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.learntodayrestapi.dao.StudentDAO;
import com.cognizant.learntodayrestapi.exception.StudentNotFoundException;
import com.cognizant.learntodayrestapi.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	public boolean saveStudent(Student s) {
		return studentDAO.saveStudent(s);
	}

	public boolean deleteStudent(int id) throws StudentNotFoundException {
		return studentDAO.deleteStudent(id);
	}

}
