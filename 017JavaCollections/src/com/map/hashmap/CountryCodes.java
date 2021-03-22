package com.map.hashmap;

import java.util.HashMap;

public class CountryCodes {
	public static void main(String[] args) {
		HashMap<String, String> countryCodes = new HashMap<>();// 200
		countryCodes.put("93", "AFG");
		countryCodes.put("1", "USA");
		countryCodes.put("91", "IND");
		countryCodes.put("44", "UK");
		countryCodes.put("33", "NZ");
		
		System.out.println(countryCodes);

	}
}
