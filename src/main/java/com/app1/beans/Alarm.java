package com.app1.beans;

import java.util.Calendar;

public class Alarm {

	
	private Calendar calendar;

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public void sayAlarm(){
		
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
	}
	
}
