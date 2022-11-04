package com.jdc.bridge.model;

import java.util.List;

public record Student(
		int id,
		String name,
		String phone,
		String email
		) {
	
	public static Student from(String line) {
		var array = line.split("\t");
		return new Student(Integer.parseInt(array[0]), array[1], array[2], array[3]);
	}

	public List<String> toList() {
		return List.of(String.valueOf(id), name, phone, email);
	}
}
