package com.jdc.registration;

import java.util.List;

import com.jdc.registration.actions.CreateStudentAction;
import com.jdc.registration.actions.DeleteStudentAction;
import com.jdc.registration.actions.ShowStudentAction;

public class RegistrationApp {

	public static void main(String[] args) {

		// Welcome Message
		System.out.println("========================");
		System.out.println("Registraion Application");
		System.out.println("========================");

		// Launch Application
		var controller = new RegistrationController(
				List.of(new CreateStudentAction(), new ShowStudentAction(), new DeleteStudentAction()));
		controller.launch();

		// Thanks Message
		System.out.println("========================");
		System.out.println("See you!");
		System.out.println("========================");
	}
}
