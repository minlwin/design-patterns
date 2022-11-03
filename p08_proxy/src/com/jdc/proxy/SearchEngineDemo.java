package com.jdc.proxy;

import java.util.Scanner;

public class SearchEngineDemo {

	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		
		var engine = new SearchServicePorxy(new SearchEngine());
		
		while(true) {
			
			System.out.print("Enter Keyword : ");
			var keyword = scanner.nextLine();
			
			var result = engine.search(keyword);
			System.out.println("Result : %s".formatted(result));
			
			System.out.print("Continue (Y/Others) : ");
			
			if(!"Y".equalsIgnoreCase(scanner.nextLine())) {
				break;
			}
		}
		
		scanner.close();
	}
}
