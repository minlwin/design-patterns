package com.jdc.registration.actions;

import com.jdc.registration.BusinessAction;
import com.jdc.registration.model.StudentRegistry;
import com.jdc.registration.utils.Inputs;

public class DeleteStudentAction implements BusinessAction {

	@Override
	public String title() {
		return "Delete Student";
	}

	@Override
	public void doAction() {
		var id = Inputs.readInt("Enter Id");
		var result = StudentRegistry.getInstance().delete(id);
		System.out.println("There are %d students in our applcation.".formatted(result));
	}

}
