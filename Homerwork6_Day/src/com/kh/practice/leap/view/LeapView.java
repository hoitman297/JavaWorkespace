package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	public LeapView() {
		LeapController lc = new LeapController();
		Calendar cal = new GregorianCalendar(Calendar.YEAR,Calendar.MONTH+1,Calendar.DATE);

		lc.leapDate(cal);
	}
}
