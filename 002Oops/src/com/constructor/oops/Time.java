package com.constructor.oops;

public class Time {
	private int second;
	private int minute;
	private int hour;
	public Time(int second, int minute, int hour) {
		super();
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	public Time() {
		
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public String toString() {
		return  String.format("%02d:%02d:%02d", hour, minute, second);
	}
	 public void setTime(int second, int minute, int hour) {
	      // No input validation
	      this.second = second;
	      this.minute = minute;
	      this.hour = hour;
	   }

}
