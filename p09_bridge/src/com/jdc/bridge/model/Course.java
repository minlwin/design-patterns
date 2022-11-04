package com.jdc.bridge.model;

import java.util.List;

public record Course(
		int id,
		String name,
		String level,
		int hours,
		int fees
		) {
	
	public static Course from(String line) {
		var array = line.split("\t");
		return new Course(
				Integer.parseInt(array[0]), 
				array[1], 
				array[2], 
				Integer.parseInt(array[3]), 
				Integer.parseInt(array[4]));
	}

	public List<String> toList() {
		return List.of(String.valueOf(id), name, level, String.valueOf(hours), String.valueOf(fees));
	}
}
