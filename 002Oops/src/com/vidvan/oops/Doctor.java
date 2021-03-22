package com.vidvan.oops;

public class Doctor {

	public int id;
	public String name;
	public String Speciolization;
	public double pn;

	public void display() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("Speciolization=" + Speciolization);
		System.out.println("pn=" + pn);
	}

	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.id = 1;
		d.name = "kartheek";
		d.Speciolization = "cardiology";
		d.pn = 123456;
		d.display();

		System.out.println("________");

		Patient p = new Patient();
		p.pAddress = "vizag";
		p.pAge = "45";
		p.pName = "sandeep";
		p.pPhn = "34356";
		p.pSex = "male";
		p.pRoomno = "202";
		p.pId = "9";
		p.display();

		System.out.println("_______");

		Departement A = new Departement();
		A.dId = "123";
		A.dName = "abc";
		A.dDoctorId = "12";
		A.display();

		System.out.println("_________");

		Receptionist r = new Receptionist();
		r.rName = "pavan";
		r.rId = "6";
		r.display();
		System.out.println("___________");

		Staff s = new Staff();
		s.sId = 245;
		s.sName = "khan";
		s.display();

	}
}
