package com.jdc.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class StudentModel {
	
	private List<Student> list;
	
	public StudentModel(String fileName) {
		
		try {
			list = Files.lines(Paths.get(fileName))
				.map(Student::new)
				.toList();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public List<Student> getAll() {
		return this.list;
	}
}
