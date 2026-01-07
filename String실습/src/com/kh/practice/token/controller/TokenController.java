package com.kh.practice.token.controller;

import java.util.Iterator;
import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
			String s = "";
		StringTokenizer stn = new StringTokenizer(str , " ");
		while (stn.hasMoreTokens()) {
			s += stn.nextToken();
		}
		return s;

	}
	
	public String firstCap(String input) {
		return  (input.charAt(0) + "").toUpperCase() + input.substring(1);
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++; 
			}
		}
		 return count;
	}
}
