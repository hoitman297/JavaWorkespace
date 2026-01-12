package com.kh.practice.chap02_abs.run;

import com.kh.practice.chap02_abs.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = pc.method();
		
		for(String str : arr) {
			System.out.println(str);
		}
	}
}








