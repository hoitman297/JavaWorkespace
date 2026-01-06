package com.kh.practice.chap02_abs.run;

import java.util.Iterator;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;
import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class Run {
	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] arr = pc.method();
		
		for (String str : arr) {
			
		}
	}
}
