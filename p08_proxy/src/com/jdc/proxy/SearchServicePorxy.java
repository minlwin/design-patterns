package com.jdc.proxy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SearchServicePorxy implements SearchService{

	private Map<String, String> cache;
	private SearchService serivce;
	
	public SearchServicePorxy(SearchService serivce) {
		super();
		this.serivce = serivce;
		cache = Collections.synchronizedMap(new HashMap<>());
	}

	@Override
	public String search(String keyword) {
		
		var result = cache.get(keyword);
		
		if(result == null) {
			result = serivce.search(keyword);
			
			if(!result.equals("There is no result")) {
				cache.put(keyword, result);
			}
		}
		
		return result;
	}

}
