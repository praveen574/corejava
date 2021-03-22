package com.map.hashmap;

import java.util.HashMap;

public class ServerExceptions {
	
	public static void main(String[] args) {
		HashMap<String, String> serverExceptions = new HashMap<>();
		serverExceptions.put("200", "ok");//one entry
		serverExceptions.put("500", "Internal server error");
		serverExceptions.put("300", "Bad request");
		serverExceptions.put("404", "page not found exception");
		System.out.println(serverExceptions);
	}
}
