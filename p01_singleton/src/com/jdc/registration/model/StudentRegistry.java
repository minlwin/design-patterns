package com.jdc.registration.model;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

	private static StudentRegistry instance;

	private List<Student> list;

	private StudentRegistry() {
		list = new ArrayList<>();
	}

	public static StudentRegistry getInstance() {
		if (null == instance) {
			instance = new StudentRegistry();
		}
		return instance;
	}

	public List<Student> getAllStudents() {
		return new ArrayList<>(list);
	}

	public int addStudent(Student student) {
		list.add(student);
		return list.size();
	}

	public int delete(int id) {
		list.remove(id - 1);
		return list.size();
	}

	public Student findById(int id) {
		return list.get(id - 1);
	}

}
