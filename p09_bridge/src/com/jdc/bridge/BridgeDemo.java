package com.jdc.bridge;

import com.jdc.bridge.component.HorizontalTableView;
import com.jdc.bridge.component.TableView;
import com.jdc.bridge.component.VerticalTableView;
import com.jdc.bridge.model.CourseDataModel;
import com.jdc.bridge.model.StudentDataModel;

public class BridgeDemo {

	public static void main(String[] args) {
		
		var students = new StudentDataModel("students.txt");
		draw(new HorizontalTableView(students));
		draw(new VerticalTableView(students));
			
		var courses = new CourseDataModel("courses.txt");
		draw(new HorizontalTableView(courses));
		draw(new VerticalTableView(courses));
	}
	
	static void draw(TableView table) {
		table.draw();
		System.out.println();
	}
}
