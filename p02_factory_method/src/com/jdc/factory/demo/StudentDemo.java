package com.jdc.factory.demo;

public class StudentDemo {

	public static void main(String[] args) {

		// Static Factory Method
		var student1 = StudentFactory.generateByNameAndPhone("Aung Aung", "0918181717");
		System.out.println(student1);

		var student2 = StudentFactory.generateByNameAndEmail("Thidar", "thidar@gmail.com");
		System.out.println(student2);

		// Instance Factory Method
		var gradeOneFactory = new GradeSpecificStudentFactory("Grade One");
		var student3 = gradeOneFactory.withName("Nilar");
		System.out.println(student3);

	}
}
