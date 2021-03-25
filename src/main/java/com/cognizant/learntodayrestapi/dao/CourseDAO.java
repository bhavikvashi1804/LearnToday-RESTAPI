package com.cognizant.learntodayrestapi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.cognizant.learntodayrestapi.model.Course;

@Component
public class CourseDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<Course>();
		try {
			courses = jdbcTemplate.query("SELECT * FROM Course", new CourseListExtractor());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return courses;
	}

	public List<Course> getAllCoursesSortByStartDate() {
		return null;
	}

	public Course getCourseById() {
		return null;
	}

}

class CourseListExtractor implements ResultSetExtractor<List<Course>> {

	@Override
	public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Course> list = new ArrayList<Course>();
		while (rs.next()) {
			Course course = new Course(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5),
					rs.getDate(6));
			list.add(course);
		}
		return list;
	}
}

class CourseExtractor implements ResultSetExtractor<Course> {

	@Override
	public Course extractData(ResultSet rs) throws SQLException, DataAccessException {
		rs.next();
		return new Course(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5),
				rs.getDate(6));
	}

}
