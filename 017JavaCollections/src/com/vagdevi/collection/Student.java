package com.vagdevi.collection;

public class Student {
	private int sid;
	private String sname;
	private float sfee;
	public Student(int sid, String sname, float sfee) {
	
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(sfee);
		result = prime * result + sid;
		result = prime * result + ((sname == null) ? 0 : sname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Float.floatToIntBits(sfee) != Float.floatToIntBits(other.sfee))
			return false;
		if (sid != other.sid)
			return false;
		if (sname == null) {
			if (other.sname != null)
				return false;
		} else if (!sname.equals(other.sname))
			return false;
		return true;
	}
	
	
	
	
	

}
