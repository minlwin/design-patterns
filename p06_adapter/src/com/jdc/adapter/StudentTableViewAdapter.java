package com.jdc.adapter;

import java.util.List;

import com.jdc.component.TableView.DataModel;
import com.jdc.model.Student;

public class StudentTableViewAdapter implements DataModel{

	private List<Student> list;

	public StudentTableViewAdapter(List<Student> list) {
		super();
		this.list = list;
	}

	@Override
	public String title() {
		return "Student Table";
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public List<String> headers() {
		return List.of("ID", "NAME", "PHONE", "EMAIL");
	}

	@Override
	public List<String> row(int index) {
		var student = list.get(index);
		return List.of(
				String.valueOf(student.getId()), 
				student.getName(),
				student.getPhone(),
				student.getEmail());
	}
	
	
}
