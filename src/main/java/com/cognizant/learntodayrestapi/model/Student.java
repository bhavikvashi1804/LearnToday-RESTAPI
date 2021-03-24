package com.cognizant.learntodayrestapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

	// properties
	@JsonProperty(value = "EnrollmentId", index = 0)
	private int enrollmentId;
	@JsonProperty(value = "StudentId", index = 1)
	private int studentId;
	@JsonProperty(value = "CourseId", index = 2)
	private int courseId;

	// getters and setters
	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	// constructor
	public Student() {

	}

	public Student(int enrollmentId, int studentId, int courseId) {
		super();
		this.enrollmentId = enrollmentId;
		this.studentId = studentId;
		this.courseId = courseId;
	}

}