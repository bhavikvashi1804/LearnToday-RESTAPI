package com.cognizant.learntodayrestapi.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {

	// properties
	@JsonProperty(value = "CourseId", index = 0)
	private int courseId;
	@JsonProperty(value = "Title", index = 1)
	private String title;
	@JsonProperty(value = "Fees", index = 2)
	private float fees;
	@JsonProperty(value = "Description", index = 3)
	private String description;
	@JsonProperty(value = "Trainer", index = 4)
	private String trainer;
	@JsonProperty(value = "Start_Date", index = 5)
	private Date startDate;

	// getters and setters
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	// constructor
	public Course() {

	}

	public Course(int courseId, String title, float fees, String description, String trainer, Date startDate) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.fees = fees;
		this.description = description;
		this.trainer = trainer;
		this.startDate = startDate;
	}

}
