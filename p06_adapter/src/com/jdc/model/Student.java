package com.jdc.model;

public class Student {

	private int id;
	private String name;
	private String phone;
	private String email;
	
	public Student(String line) {
		var array = line.split("\t");
		id = Integer.parseInt(array[0]);
		name = array[1];
		phone = array[2];
		email = array[3];	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
