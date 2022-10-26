package com.jdc.registration.utils;

import java.util.Scanner;

public class Inputs {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static int readInt(String message) {
		var str = readString(message);
		return Integer.parseInt(str);
	}
	
	public static String readString(String message) {
		System.out.printf("%-20s : ", message);
		return scanner.nextLine();
	}
}
