package com.jdc.component;

import java.util.ArrayList;
import java.util.List;

public class TableView {

	public static interface DataModel {
		String title();
		int size();
		List<String> headers();
		List<String> row(int index);
	}
	
	private DataModel model;
	
	private int rowLength;
	private List<Integer> colLengths;
	
	public TableView(DataModel model) {
		super();
		this.model = model;
		
		var headerLengths = model.headers().stream()
				.map(header -> header.length() + 4).toList();
		colLengths = new ArrayList<>(headerLengths);
		
		// Loop for each row
		for(var rowNum = 0; rowNum < model.size(); rowNum ++) {
			var rowData = model.row(rowNum);
			
			// Loop for each column of row
			for(var colNum = 0; colNum < rowData.size(); colNum ++) {
				
				var originalLength = colLengths.get(colNum);
				var colLength = rowData.get(colNum).length() + 4;
				
				if(originalLength < colLength) {
					colLengths.set(colNum, colLength);
				}
			}
		}
		
		rowLength = colLengths.stream().mapToInt(a -> a).sum();
	}

	public void draw() {
		printTitle();
		
		printHeader();
		
		printRows();
	}

	private void printTitle() {
		System.out.println(model.title());
		printLine();
	}

	private void printHeader() {
		var headers = model.headers();
		printRow(headers);
	}

	private void printRows() {

		for(var i = 0; i < model.size(); i ++) {
			var rowData = model.row(i);
			printRow(rowData);
		}
	}

	private void printRow(List<String> rowData) {
		for(var i = 0; i < rowData.size(); i ++) {
			var colLength = colLengths.get(i);
			var colValue = rowData.get(i);
			System.out.print("%%-%ds".formatted(colLength).formatted(colValue));
		}
		System.out.println();
		printLine();
	}

	private void printLine() {
		System.out.println("%%%ds".formatted(rowLength).formatted("").replaceAll(" ", "-"));
	}

}
