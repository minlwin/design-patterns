package com.jdc.factory.demo;

public class StudentFactory {

	public static Student generateByNameAndPhone(String name, String phone) {
		var student = new Student();
		student.setName(name);
		student.setPhone(phone);
		return student;
	}

	public static Student generateByNameAndEmail(String name, String email) {
		var student = new Student();
		student.setName(name);
		student.setEmail(email);
		return student;
	}
}
