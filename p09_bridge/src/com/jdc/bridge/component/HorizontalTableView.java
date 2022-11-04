package com.jdc.bridge.component;

import java.util.List;

public class HorizontalTableView extends TableView{

	public HorizontalTableView(DataModel model) {
		super(model);
	}

	@Override
	protected void init() {
		
		colLengths.addAll(model.headers().stream().map(a -> a.length() + 4).toList());
		
		for(var rowIndex = 0; rowIndex < model.size(); rowIndex ++) {
			
			var row = model.row(rowIndex);
			
			for(var colIndex = 0; colIndex < row.size(); colIndex ++) {
				
				var colSize = row.get(colIndex).length() + 4;
				
				if(colSize > colLengths.get(colIndex)) {
					colLengths.set(colIndex, colSize);
				}
			}
		}
	}

	@Override
	public void draw() {
		
		// Draw Title
		System.out.println("Horizontal %s Table".formatted(model.title()));
		printLine();
		printRow(model.headers());
		printLine();
		
		for(var i = 0; i < model.size(); i ++) {
			printRow(model.row(i));
		}
		printLine();		
	}
	
	private void printRow(List<String> row) {
		for(var i = 0; i < row.size(); i ++) {
			var colLength = colLengths.get(i);
			var colData = row.get(i);
			System.out.printf("%%-%ds".formatted(colLength).formatted(colData));
		}
		System.out.println();
	}

}
