package com.jdc.registration.actions;

import java.util.List;

import com.jdc.registration.BusinessAction;
import com.jdc.registration.model.Student;
import com.jdc.registration.model.StudentRegistry;

public class ShowStudentAction implements BusinessAction {

	private StudentRegistry registory;

	public ShowStudentAction() {
		registory = StudentRegistry.getInstance();
	}

	@Override
	public String title() {
		return "Show Students";
	}

	@Override
	public void doAction() {
		List<Student> students = registory.getAllStudents();

		printLine();
		printRow("Id", "Name", "Phone", "Email");
		printLine();

		for (int i = 0; i < students.size(); i++) {
			var student = students.get(i);
			printRow(i + 1, student.getName(), student.getPhone(), student.getEmail());
		}
		printLine();
	}

	private void printRow(Object col1, Object col2, Object col3, Object col4) {
		System.out.printf("%-3s%-16s%-16s%-20s%n", col1, col2, col3, col4);
	}

	private void printLine() {
		System.out.println("%55s".formatted("").replaceAll(" ", "-"));
	}

}
