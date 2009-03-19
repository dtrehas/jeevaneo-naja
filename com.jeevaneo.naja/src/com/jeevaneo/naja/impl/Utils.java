package com.jeevaneo.naja.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

public class Utils {

	private final static SortedSet<Date> bankHolidays = new TreeSet<Date>();
	static {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
		// TODO externalize and make parametrizable
		try {
			bankHolidays.add(sdf.parse("2009-01-01"));
			bankHolidays.add(sdf.parse("2009-01-04"));
			bankHolidays.add(sdf.parse("2009-04-13"));
			bankHolidays.add(sdf.parse("2009-05-01"));
			bankHolidays.add(sdf.parse("2009-05-08"));
			bankHolidays.add(sdf.parse("2009-05-21"));
			bankHolidays.add(sdf.parse("2009-06-01"));
			bankHolidays.add(sdf.parse("2009-07-14"));
			bankHolidays.add(sdf.parse("2009-08-15"));
			bankHolidays.add(sdf.parse("2009-11-01"));
			bankHolidays.add(sdf.parse("2009-11-11"));
			bankHolidays.add(sdf.parse("2009-12-25"));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	
	}


	public static SortedSet<Date> findOpenedDates(Date firstDate, int availability, int maxLoadPerDay) {
			SortedSet<Date> ret = new TreeSet<Date>();
			Calendar cal = Calendar.getInstance();
			cal.setTime(firstDate);
			cal.add(Calendar.DAY_OF_WEEK, -1);
			//TODO imputations can be before startAvailability
	//		for(Imputation imputation:getImputations())
	//		{
	//			availability-=imputation.getLoad();
	//		}
			int leftDays = availability / maxLoadPerDay
					+ (availability % maxLoadPerDay == 0 ? 0 : 1);
			while (leftDays > 0) {
				cal.add(Calendar.DAY_OF_WEEK, 1);
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
						|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					// week end
					continue;
				}
				if (isBankHoliday(cal.getTime())) {
					continue;
				}
				ret.add(cal.getTime());
				leftDays--;
			}
			return ret;
		}

	public static SortedSet<Date> findOpenedDates(Date firstDate, Date lastDate) {
			SortedSet<Date> ret = new TreeSet<Date>();
			Calendar cal = Calendar.getInstance();
			cal.setTime(firstDate);
			Calendar calEnd = Calendar.getInstance();
			calEnd.setTime(lastDate);
			cal.add(Calendar.DAY_OF_WEEK, -1);
			//TODO imputations can be before startAvailability
	//		for(Imputation imputation:getImputations())
	//		{
	//			availability-=imputation.getLoad();
	//		}
			
			while (cal.before(calEnd)) {
				cal.add(Calendar.DAY_OF_WEEK, 1);
				if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
						|| cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					// week end
					continue;
				}
				if (isBankHoliday(cal.getTime())) {
					continue;
				}
				ret.add(cal.getTime());
			}
			return ret;
		}

	public static boolean isBankHoliday(Date date) {
		return bankHolidays.contains(date);
	}
	
	public static void main(String[] args) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date start = sdf.parse("20090101");
		Date end = sdf.parse("20090306");
		
		int i=1;
		for(Date day : findOpenedDates(start, end))
		{
			System.out.println("" + i++ + " " + day);
		}
	}

}
