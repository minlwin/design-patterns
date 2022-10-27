package com.jdc.gui;

public class GuiApp implements Component{
	
	private Button button;
	private Dialog dialog;
	
	public GuiApp(ComponentsFactory factory) {
		this.button = factory.createButton();
		this.dialog = factory.createDialog();
	}

	@Override
	public void draw() {
		dialog.draw();
		button.draw();
	}

}
