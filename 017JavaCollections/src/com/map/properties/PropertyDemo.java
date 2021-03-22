package com.map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("E:\\pro.txt");
	Properties properties=new Properties();
	properties.load(fis);
	//System.out.println(properties);
	properties.setProperty("password", "vidvan");
	System.out.println(properties.get("user"));
	System.out.println(properties.get("password"));
	
}
}
