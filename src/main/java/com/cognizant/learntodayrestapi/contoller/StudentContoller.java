package com.cognizant.learntodayrestapi.contoller;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.learntodayrestapi.exception.StudentNotFoundException;
import com.cognizant.learntodayrestapi.model.Student;
import com.cognizant.learntodayrestapi.service.StudentService;

@RestController
@RequestMapping("/api/Student")
public class StudentContoller {

	@Autowired
	private StudentService studentService;

	@GetMapping
	public ResponseEntity<Object> getAllCourses() {
		return null;
	}

	@PostMapping
	public ResponseEntity<Object> postStudent(@RequestBody Student student) {

		boolean isStudentAdded = studentService.saveStudent(student);

		if (isStudentAdded) {
			return new ResponseEntity(student, HttpStatus.CREATED);
		} else {
			Map<String, Object> body = new LinkedHashMap<>();
			body.put("timestamp", new Date());
			body.put("Message", "Something went wrong");
			return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudentEnrollment(@PathVariable("id") int id) throws StudentNotFoundException {

		boolean isStudentDeleted = studentService.deleteStudent(id);

		if (isStudentDeleted) {
			return new ResponseEntity("Student deletion done", HttpStatus.OK);
		} else {
			Map<String, Object> body = new LinkedHashMap<>();
			body.put("timestamp", new Date());
			body.put("Message", "Something went wrong");
			return new ResponseEntity(body, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
