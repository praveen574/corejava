package com.map.linkedhashmap;
public class Course {

	private String language;
	private int duration;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String language, int duration) {
		super();
		this.language = language;
		this.duration = duration;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [language=" + language + ", duration=" + duration + "]";
	}

}
