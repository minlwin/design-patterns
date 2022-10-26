package com.jdc.factory.demo;

public class GradeSpecificStudentFactory {

	private String className;

	public GradeSpecificStudentFactory(String className) {
		this.className = className;
	}

	public Student withName(String name) {
		var student = new Student();
		student.setName(name);
		student.setClassName(className);
		return student;
	}
}
