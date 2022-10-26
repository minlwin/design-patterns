package com.jdc.builder.demo;

public class BuilderDemo {

	public static void main(String[] args) {

		var student = Student.builder()
				.name("Aung Aung")
				.phone("091827272")
				.email("aung@gmail.com")
				.grade("Grade 10").build();
		
		System.out.println(student);
	}
}
