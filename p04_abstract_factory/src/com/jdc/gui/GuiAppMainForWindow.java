package com.jdc.gui;

import com.jdc.gui.windows.WindowComponentFactory;

public class GuiAppMainForWindow {

	public static void main(String[] args) {
		var app = new GuiApp(new WindowComponentFactory());
		app.draw();
	}
}
