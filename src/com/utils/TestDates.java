package com.utils;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String startDateString = "20180110";
		String endDateString = "20180210";
		String historyStartDate = "20180501";
		String  historyEndDate = "20180531";
		 
	//	getdates2(startDateString,endDateString);
		//getDates1(startDateString,endDateString,historyStartDate,historyEndDate);
		getDates(startDateString,endDateString,historyStartDate,historyEndDate);
	}
	public static void getDates(String startDateString, String endDateString,String historyStartDate,String historyEndDate) {
		String turnOfCentury = "19000101";
		
		
		

	//	UltimateRejectFileDates initializedRejectDates = new UltimateRejectFileDates();

		if (turnOfCentury.equalsIgnoreCase(startDateString) || turnOfCentury.equalsIgnoreCase(endDateString)
				|| turnOfCentury.equalsIgnoreCase(historyStartDate) || turnOfCentury.equalsIgnoreCase(historyEndDate)) {

			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -2);
			c.set(Calendar.DAY_OF_MONTH, 10);

			// Start date calculation
			java.util.Date start = c.getTime();
			java.sql.Date startDate = new java.sql.Date(start.getTime());
			System.out.println("start date :" + startDate);

			// End date calculation
			Calendar endCal = Calendar.getInstance();
			endCal.add(Calendar.MONTH,-1);
			endCal.add(Calendar.DAY_OF_MONTH, 1);
			//c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			endCal.set(Calendar.DAY_OF_MONTH,10);
			java.util.Date end = endCal.getTime();
			java.sql.Date endDate = new java.sql.Date(end.getTime());
			
			System.out.println("endDate date :" + endDate);
			
			
			Calendar hisCal = Calendar.getInstance();
			hisCal.add(Calendar.MONTH, -1);
			hisCal.set(Calendar.DAY_OF_MONTH, 1);

			// Start date calculation
			java.util.Date hisstart = hisCal.getTime();
			java.sql.Date hisstartDate = new java.sql.Date(hisstart.getTime());
			System.out.println("hisstartDate date :" + hisstartDate);
			// End date calculation
			Calendar hisendCal = Calendar.getInstance();
			hisendCal.add(Calendar.MONTH,-1);
			hisendCal.add(Calendar.DAY_OF_MONTH, 0);
			hisendCal.set(Calendar.DAY_OF_MONTH,hisCal.getActualMaximum(Calendar.DAY_OF_MONTH));
			java.util.Date histend = hisendCal.getTime();
			java.sql.Date histendDate = new java.sql.Date(histend.getTime());
			
			System.out.println("histendDate date :" + histendDate);
			
			
		} else {
			System.out.println(parseDateYYYYMMDD(startDateString));
			System.out.println(parseDateYYYYMMDD(endDateString));
			System.out.println(parseDateYYYYMMDD(historyStartDate));
			System.out.println(parseDateYYYYMMDD(historyEndDate));
		}
	}
	
	public static Date parseDateYYYYMMDD(String date) {
		if (date == null || date.length() < 8)
			return null;
		try {
			int year;
			int month;
			int day;

			year = Integer.parseInt(date.substring(0, 4));
			month = Integer.parseInt(date.substring(4, 6));
			day = Integer.parseInt(date.substring(6, 8));

			GregorianCalendar gc = new GregorianCalendar(year, month - 1, day);
			return new Date(gc.getTimeInMillis());
		} catch (Exception e) {
			return null;
		}
	}
	
	
	public static void getDates1(String startDateString, String endDateString,String historyStartDate,String historyEndDate) {
		String turnOfCentury = "19000101";


		if (turnOfCentury.equalsIgnoreCase(startDateString) || turnOfCentury.equalsIgnoreCase(endDateString)
				|| turnOfCentury.equalsIgnoreCase(historyStartDate) || turnOfCentury.equalsIgnoreCase(historyEndDate)) {

			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -2);
			c.set(Calendar.DAY_OF_MONTH, 10);

			// Start date calculation
			java.util.Date start = c.getTime();
			java.sql.Date startDate = new java.sql.Date(start.getTime());
			System.out.println("startDate::" + startDate);

			// End date calculation
			Calendar endCal = Calendar.getInstance();
			endCal.add(Calendar.MONTH,-1);
			endCal.add(Calendar.DAY_OF_MONTH, -1);
			//c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			endCal.set(Calendar.DAY_OF_MONTH,10);
			java.util.Date end = endCal.getTime();
			java.sql.Date endDate = new java.sql.Date(end.getTime());
			System.out.println("end::" + endDate);
			
			Calendar hisCal = Calendar.getInstance();
			hisCal.add(Calendar.MONTH, -1);
			hisCal.set(Calendar.DAY_OF_MONTH, 1);

			// Start date calculation
			java.util.Date hisstart = hisCal.getTime();
			java.sql.Date hisstartDate = new java.sql.Date(hisstart.getTime());
			System.out.println("startDate::" + hisstartDate);// End date calculation
			Calendar hisendCal = Calendar.getInstance();
			hisendCal.add(Calendar.MONTH,-1);
			hisendCal.add(Calendar.DAY_OF_MONTH, -1);
			//c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			hisendCal.set(Calendar.DAY_OF_MONTH,hisCal.getActualMaximum(Calendar.DAY_OF_MONTH));
			java.util.Date histend = hisendCal.getTime();
			java.sql.Date histendDate = new java.sql.Date(histend.getTime());
			System.out.println("end::" + histendDate);	
		} else {
			System.out.println(parseDateYYYYMMDD(startDateString));
			System.out.println(parseDateYYYYMMDD(endDateString));
			System.out.println(parseDateYYYYMMDD(historyStartDate));
			System.out.println(parseDateYYYYMMDD(historyEndDate));
		}
}
	
	public static void getdates2(String startDateString, String endDateString) {
		String turnOfCentury = "19000101";


		if (turnOfCentury.equalsIgnoreCase(startDateString) || turnOfCentury.equalsIgnoreCase(endDateString)) {

			Calendar c = Calendar.getInstance();
			c.add(Calendar.MONTH, -1);
			c.set(Calendar.DAY_OF_MONTH, 1);

			// Start date calculation
			java.util.Date start = c.getTime();
			java.sql.Date startDate = new java.sql.Date(start.getTime());
			System.out.println(startDate);

			// End date calculation
			Calendar endCal = Calendar.getInstance();
			endCal.add(Calendar.MONTH,-1);
			endCal.add(Calendar.DAY_OF_MONTH,0);
			//c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			endCal.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH));
			java.util.Date end = endCal.getTime();
			java.sql.Date endDate = new java.sql.Date(end.getTime());
			System.out.println(endDate);

		} else {
			System.out.println(parseDateYYYYMMDD(startDateString));
			System.out.println(parseDateYYYYMMDD(endDateString));
		}
}
}
