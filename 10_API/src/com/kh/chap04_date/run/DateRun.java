package com.kh.chap04_date.run;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {
	
	/*
		Calendar
			- 날짜와 시간에 대한 대한 데이터를 처리하는 "추상클래스"
	 */
	
	public void test1() {
		Calendar call = new GregorianCalendar();
		Calendar cal2 = Calendar.getInstance(); //주로 사용
		
		System.out.println(call);
		
		System.out.println(call.get(Calendar.YEAR));
		System.out.println(call.get(Calendar.MONTH) + 1);
		System.out.println(call.get(Calendar.DATE));
		
		System.out.println(call.get(Calendar.HOUR));
		System.out.println(call.get(Calendar.HOUR_OF_DAY));
		System.out.println(call.get(Calendar.MINUTE));
		System.out.println(call.get(Calendar.SECOND));
		
		printCalendar(call);
	}
	
	public void test2() {
		//특정일 특정시간으로 초기화된 Calendar 객체 생성
		Calendar call = Calendar.getInstance();
		//2027년 1월 1일 0시 0분 0초
		call.set(2027, 0, 1, 0, 0, 0);
		printCalendar(call);
		
		Calendar call2 = new GregorianCalendar(2027, 1, 1, 0, 0,0);
		printCalendar(call2);
		
		//날짜 차이 계산하기
		Calendar now = Calendar.getInstance();
		Calendar dDay = new GregorianCalendar(2026, 0, 27);
		
		//각 캘린더객체를 밀리초로 변환하여 차이를 구한다.
		
		long num1 = now.getTimeInMillis(); // 1970년 1월1일부터 ~ 현재시간까지 흐른 밀리초
		long num2 = dDay.getTimeInMillis();
		
		double diff = (num2 - num1) / 1000.0 / 60 / 60 / 24; //밀리초 때문에 1000을 나눔
		System.out.println(diff);
		
		System.out.println("시험날까지 D-" + (int)(diff+1) + "일 남았습니다.");
	}
	
	/*
			java.util.Date 클래스
			 - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
			 - 자바 개발 초창기에 급하게 만들어진 클래스라 완성도가 높지 않다.
	 */
	
	public static void test3() {
		// 기본생성자를 통해 Date 객체 생성
		// - 현재 날짜 및 시간을 가지고 생성
		Date today = new Date();
		System.out.println("기본생성자 : " + today);

		// 내가 원하는 날짜(2025년 6월 19일)로 초기화
		// 방법 1. 년, 월, 일 생성자를 이용
		Date date1 = new Date(2025 - 1900, 6 - 1, 19, 19, 0, 0);
		System.out.println(date1);
		
		// 방법 2. 밀리세컨즈를 매개변수로 받는 생성자를 이용.
		Calendar cal2 = new GregorianCalendar(2025, 5, 19);
		long millis = cal2.getTimeInMillis();
		
		Date date2 = new Date(millis);
		System.out.println("밀리세컨즈 생성자 : " + date2);
	}
	public void test4() {
		/*
			java.text.SimpleDateFormat (와 씨 진짜 감동)
			xxxx 년 xx월 xx일 xx시 xx분 xx초
			
			SimpleDateFormat 객체생성
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초");
		
		// sdf.format(Date객체) : 문자열반환
		// - 포맷대로 지정된 문자열 반환
		String formatDate = sdf.format(new Date());
		System.out.println(formatDate);
	}
	
	/*
			번외)	숫자값 형식 지정
				DecimalFormat
				
				#해당자리에 데이터가 없는 경우 생략시키는 형식
				0 해당자리에 데이터가 없는 경우 0으로 표시해주는 형식0
	 */
	
	public static void test5() {
		double num = 1234567890.123;
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df.applyPattern("#.00000");
		System.out.println(df.format(num));
	}
		
	public void printCalendar(Calendar c) {
        System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
                          c.get(Calendar.YEAR),
                          c.get(Calendar.MONTH) + 1,
                          c.get(Calendar.DATE),
                          c.get(Calendar.HOUR_OF_DAY),
                          c.get(Calendar.MINUTE),
                          c.get(Calendar.SECOND)
                );
    }
	
	public static void main(String[] args) {
		DateRun dr = new DateRun();
		dr.test5();
	}
}
