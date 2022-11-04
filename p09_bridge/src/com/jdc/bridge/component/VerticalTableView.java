package com.jdc.bridge.component;

public class VerticalTableView extends TableView{

	private int headerSize;

	public VerticalTableView(DataModel model) {
		super(model);
	}

	@Override
	protected void init() {
		

		// Column Sizes
		for(var x = 0; x < model.size(); x ++) {
			colLengths.add(0);
			
			var row = model.row(x);
			
			for(var y = 0; y < row.size(); y ++) {
				var colLength = row.get(y).length() + 4;
				
				if(colLength > colLengths.get(x)) {
					colLengths.set(x, colLength);
				}
			}
		}

		// Header Size
		headerSize = model.headers().stream().mapToInt(a -> a.length() + 4)
				.max().getAsInt();
		colLengths.add(headerSize);
	}

	@Override
	public void draw() {
		
		System.out.println("Vertical %s Table".formatted(model.title()));
		printLine();
		
		for(var y = 0; y < model.headers().size(); y ++) {
			
			System.out.printf("%%-%ds".formatted(headerSize).formatted(model.headers().get(y)));
			
			for(var x = 0; x < model.size(); x ++) {
				
				var row = model.row(x);
				System.out.printf("%%-%ds".formatted(colLengths.get(x)).formatted(row.get(y)));
			}
			System.out.println();
		}
		printLine();
	}

}
