package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	//	입/출력 담당
	private Snack s = new Snack();

	public SnackController() {

	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료";
	}
	
	public String confirmData() {
		return s.information();
	}
}
