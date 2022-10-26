package com.jdc.registration;

import static com.jdc.registration.utils.Inputs.readInt;
import static com.jdc.registration.utils.Inputs.readString;

import java.util.List;

public class RegistrationController {

	private List<BusinessAction> actions;

	public RegistrationController(List<BusinessAction> actions) {
		super();
		this.actions = actions;
	}

	public void launch() {

		while (true) {
			try {
				showActions();
				int actionId = readUserAction();
				var action = actions.get(actionId);
				action.doAction();

				System.out.println();
				if (!wantToDoAgain()) {
					System.out.println();
					break;
				}
			} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
				System.out.println("Please enter valid menu id.");
			}

		}
	}

	private boolean wantToDoAgain() {
		var result = readString("Do again(Y/Others)");
		return "y".equalsIgnoreCase(result);
	}

	private int readUserAction() {
		return readInt("Enter Action Id") - 1;
	}

	private void showActions() {
		for (var i = 0; i < actions.size(); i++) {
			System.out.printf("%d: %s%n", i + 1, actions.get(i).title());
		}
		System.out.println();
	}

}
