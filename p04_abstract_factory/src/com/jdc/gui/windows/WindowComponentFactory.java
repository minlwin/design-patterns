package com.jdc.gui.windows;

import com.jdc.gui.Button;
import com.jdc.gui.ComponentsFactory;
import com.jdc.gui.Dialog;

public class WindowComponentFactory implements ComponentsFactory{

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public Dialog createDialog() {
		return new WindowDialog();
	}

	
}
