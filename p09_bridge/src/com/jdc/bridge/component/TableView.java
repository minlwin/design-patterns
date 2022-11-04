package com.jdc.bridge.component;

import java.util.ArrayList;
import java.util.List;

public abstract class TableView {

	protected DataModel model;
	
	protected List<Integer> colLengths;

	public TableView(DataModel model) {
		super();
		this.model = model;
		colLengths = new ArrayList<>();
		
		init();
	}
	
	protected abstract void init();
	
	public abstract void draw();
	
	protected void printLine() {
		var lineSize = colLengths.stream().mapToInt(a -> a).sum();
		System.out.println("%%%ds".formatted(lineSize).formatted("").replaceAll(" ", "-"));
	}
}
