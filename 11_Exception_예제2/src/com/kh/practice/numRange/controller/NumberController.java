package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkDouble(int num1 , int num2) throws NumRangeException {
		
		if((num1 > 100 || num1 < 1) || (num2 > 100 || num2 < 1)) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		
		if(num1 % num2 == 0) {
			return true;
		} 
		
		return false;
	}
}
