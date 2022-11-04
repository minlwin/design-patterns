package com.jdc.bridge.component;

import java.util.List;

public interface DataModel {

	String title();
	
	int size();
	
	List<String> headers();
	
	List<String> row(int index);
}
