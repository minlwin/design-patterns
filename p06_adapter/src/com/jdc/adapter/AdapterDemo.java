package com.jdc.adapter;

import com.jdc.component.TableView;
import com.jdc.model.StudentModel;

public class AdapterDemo {

	public static void main(String[] args) {
		
		var model = new StudentModel("students.txt");
		
		// Adaptee
		var studentList = model.getAll();
		
		// Adapter
		var adapter = new StudentTableViewAdapter(studentList);
		
		// Client
		var tableView = new TableView(adapter);
		
		tableView.draw();
	}
}
