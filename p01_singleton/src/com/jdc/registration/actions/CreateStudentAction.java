package com.jdc.registration.actions;

import com.jdc.registration.BusinessAction;
import com.jdc.registration.model.Student;
import com.jdc.registration.model.StudentRegistry;
import com.jdc.registration.utils.Inputs;

public class CreateStudentAction implements BusinessAction {

	private StudentRegistry registory;

	public CreateStudentAction() {
		registory = StudentRegistry.getInstance();
	}

	@Override
	public String title() {
		return "Create New Student";
	}

	@Override
	public void doAction() {

		var student = new Student();
		student.setName(Inputs.readString("Enter Name"));
		student.setPhone(Inputs.readString("Enter Phone"));
		student.setEmail(Inputs.readString("Enter Email"));

		var result = registory.addStudent(student);
		System.out.println("There are %d students in our applcation.".formatted(result));
	}

}
