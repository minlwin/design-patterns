package com.jdc.bridge.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.jdc.bridge.component.DataModel;

public class StudentDataModel implements DataModel{
	
	private List<Student> students;
	
	public StudentDataModel(String fileName) {
		
		try(var stream = Files.lines(Path.of(fileName))) {
			students = stream.map(Student::from).toList();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String title() {
		return "Student";
	}

	@Override
	public int size() {
		return students.size();
	}

	@Override
	public List<String> headers() {
		return List.of("ID", "NAME", "PHONE", "EMAIL");
	}

	@Override
	public List<String> row(int index) {
		return students.get(index).toList();
	}

}
