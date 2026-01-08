package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	Scanner sc = new Scanner(System.in);
	public LeapView() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		LeapController lc = new LeapController();
		
		System.out.println(year+"년은 "+
				(lc.isLeapYear(year) ? "윤년" : "평년") + "입니다");
		
		long total = lc.leapDate(c);
		System.out.println("총 날짜 수 :"+total);
	}
}
