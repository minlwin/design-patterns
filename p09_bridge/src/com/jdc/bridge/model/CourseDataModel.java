package com.jdc.bridge.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.jdc.bridge.component.DataModel;

public class CourseDataModel implements DataModel{
	
	private List<Course> courses;
	
	public CourseDataModel(String fileName) {
		try(var stream = Files.lines(Path.of(fileName))) {
			courses = stream.map(Course::from).toList();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String title() {
		return "Course";
	}

	@Override
	public int size() {
		return courses.size();
	}

	@Override
	public List<String> headers() {
		return List.of("ID", "NAME", "LEVEL", "HOURS", "FEES");
	}

	@Override
	public List<String> row(int index) {
		return courses.get(index).toList();
	}

}
