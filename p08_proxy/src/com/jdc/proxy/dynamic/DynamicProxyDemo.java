package com.jdc.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.jdc.proxy.SearchEngine;
import com.jdc.proxy.SearchService;

public class DynamicProxyDemo {

	
	public static void main(String[] args) {
		
		SearchService engine = getDynamicProxy();
		var scanner = new Scanner(System.in);
		
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

	private static SearchService getDynamicProxy() {
		
		var proxy = Proxy.newProxyInstance(DynamicProxyDemo.class.getClassLoader(), 
				new Class[] {SearchService.class}, new SearchEngineDynanicProxy(new SearchEngine()));
		
		return (SearchService)proxy;
	}
	
	static class SearchEngineDynanicProxy implements InvocationHandler {
		
		private Object target;
		
		private Map<String, String> map;
		
		public SearchEngineDynanicProxy(Object target) {
			super();
			this.target = target;
			map = Collections.synchronizedMap(new HashMap<>());
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
			if(method.getName().equals("search")) {
				var result = map.get(args[0].toString());
				
				if(null == result) {
					result = String.valueOf(method.invoke(target, args));
					
					if(!result.equals("There is no result")) {
						map.put(args[0].toString(), result);
					}
				}
				return result;
			}
			
			return null;
		}
		
	}
}
