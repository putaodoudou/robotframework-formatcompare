package com.github.jep42.formatcompare.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class DateHelper {

	private DateHelper() {
		super();
	}

	public static Date getDateFromFormattedDateString(String dateString, String pattern, TimeZone timezone) throws ParseException {
		long timestamp = DateHelper.getTimestamp(dateString, pattern, timezone);
		return new Date(timestamp);
	}

	private static long getTimestamp(String dateValue, String pattern, TimeZone timezone) throws ParseException {
		DateFormat d = new SimpleDateFormat(pattern);
		Calendar c = Calendar.getInstance(timezone);
		c.setTime(d.parse(dateValue));
		return c.getTimeInMillis();
	}

	public static Date setTimeToEndOfDay(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 59);
		c.set(Calendar.SECOND, 59);
		c.set(Calendar.MILLISECOND, 999);
		return c.getTime();
	}
}
