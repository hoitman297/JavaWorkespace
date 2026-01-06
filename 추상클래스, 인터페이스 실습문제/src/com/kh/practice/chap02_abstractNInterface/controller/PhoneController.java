package com.kh.practice.chap02_abstractNInterface.controller;

import java.util.Iterator;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {
	private String[] result = new String[2];

	public String[] method() {
		Phone arr[] = new Phone[2];
		arr[0] = new GalaxyNote9();
		arr[1] = new V40();

		for (int i = 0; i < arr.length; i++) {

			result[i] = ((SmartPhone) arr[i]).printInformation();
			if (arr[i] instanceof V40) {
				result[i] = ((V40) arr[i]).printInformation();
			} else if (arr[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9) arr[i]).printInformation();
			}
		}
		return result;

	}
}
