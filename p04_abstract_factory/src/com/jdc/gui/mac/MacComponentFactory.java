package com.jdc.gui.mac;

import com.jdc.gui.Button;
import com.jdc.gui.ComponentsFactory;
import com.jdc.gui.Dialog;

public class MacComponentFactory implements ComponentsFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Dialog createDialog() {
		return new MacDialog();
	}
}
