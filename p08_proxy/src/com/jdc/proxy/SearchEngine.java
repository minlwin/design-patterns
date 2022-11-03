package com.jdc.proxy;

import java.util.HashMap;
import java.util.Map;

public class SearchEngine implements SearchService{
	
	private Map<String, String> engine;
	
	public SearchEngine() {
		engine = new HashMap<>();
		engine.put("Hi", "Hello");
		engine.put("japanese hi", "konni chiwa");
		engine.put("sayonara", "Good Bye");
		engine.put("thanks", "Arigato");
		engine.put("java", "Programming Language");
		
	}

	@Override
	public String search(String keyword) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		var result = engine.get(keyword);
		
		if(null == result) {
			result = "There is no result";
		}
		
		return result;
	}

}
