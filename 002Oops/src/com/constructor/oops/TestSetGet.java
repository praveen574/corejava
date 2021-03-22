package com.constructor.oops;

public class TestSetGet {

	public static void main(String[] args) {
		SetGetDemoPerson p = new SetGetDemoPerson();
		p.setName("praveen");
		p.setAge(16);
		p.setFavcolor("yellow");
		 System.out.println(p.get(89));
		 System.out.println(p.get("ram"));
		 System.out.println(p.get("blue"));
		p.display();

	}

}
