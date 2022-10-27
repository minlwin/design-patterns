package com.jdc.gui;

import com.jdc.gui.mac.MacComponentFactory;

public class GuiAppMainForMac {

	public static void main(String[] args) {
		
		var app = new GuiApp(new MacComponentFactory());
		app.draw();
	}
}
