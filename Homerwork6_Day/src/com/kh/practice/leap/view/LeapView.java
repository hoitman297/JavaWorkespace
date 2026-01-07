package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	Scanner sc = new Scanner(System.in);
	public LeapView() {
		System.out.print("원하는 년도: ");
        int num = sc.nextInt();
        
        LeapController lc = new LeapController();
        // Calendar 객체 생성 (입력받은 년도의 1월 1일로 설정)
        Calendar cal = new GregorianCalendar(num, 0, 1);

        // 결과 출력
        if (lc.isLeapYear(num)) {
            System.out.println(num + "년은 윤년이야.");
        } else {
            System.out.println(num + "년은 평년이야.");
        }
        
        System.out.println("서기 1년 1월 1일부터 총 일수: " + lc.leapDate(cal));
	}
}
