package com.map.properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {
	public static void main(String[] args) {
		Properties capitals = new Properties();
		Set countries;
		String str;

		capitals.put("india", "new delhi");
		capitals.put("australia", "conberra");
		capitals.put("srilanka", "colombo");
		capitals.put("pakistan", "islamabad");
		capitals.put("usa", "new york");

		countries = capitals.keySet();
		Iterator itr = countries.iterator();

		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}
		System.out.println();

		// look for state not in list -- specify default
		str = capitals.getProperty("england", "Not Found");
		System.out.println("The capital of england is " + str + ".");
	}
}
