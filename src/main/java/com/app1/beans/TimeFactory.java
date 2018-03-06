package com.app1.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class TimeFactory implements FactoryBean<Calendar> {

	private int year;
	private int month;
	private int date;

	public TimeFactory(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public Calendar getObject() throws Exception {

		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month, date);

		return calendar;
	}

	public Class<?> getObjectType() {

		return Calendar.class;
	}

	public boolean isSingleton() {

		return true;
	}

}
