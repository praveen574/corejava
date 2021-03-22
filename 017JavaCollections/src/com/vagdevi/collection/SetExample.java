package com.vagdevi.collection;

import java.util.Set;
import java.util.TreeSet;

public class SetExample implements Comparable<SetExample> {
	Integer x;

	public SetExample(Integer x) {
		super();
		this.x = x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
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
		SetExample other = (SetExample) obj;
		if (x == null) {
			if (other.x != null)
				return false;
		} else if (!x.equals(other.x))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SetExample [x=" + x + "]";
	}

	@Override
	public int compareTo(SetExample o) {
		System.out.println("compare");
		return Integer.compare(this.x,o.x);
	}

	public static void main(String[] args) {
		Set<SetExample> s = new TreeSet<>();
		s.add(new SetExample(3));
		s.add(new SetExample(-3));
		s.add(new SetExample(2));
		s.add(new SetExample(1));
		s.forEach(System.out::println);
	}

}
