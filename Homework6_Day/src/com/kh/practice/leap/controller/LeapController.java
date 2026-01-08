package com.kh.practice.leap.controller;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}

	public long leapDate(Calendar c) {
		int y1 = c.get(Calendar.YEAR);
		long totalDays = 0;

		for (int i = 0; i < y1; i++) {
			if (isLeapYear(i)) {
				totalDays += 366; // 윤년
			} else {
				totalDays += 365; // 평년
			}
		}
		totalDays += c.get(Calendar.DAY_OF_YEAR);
		return totalDays;

	}
}
