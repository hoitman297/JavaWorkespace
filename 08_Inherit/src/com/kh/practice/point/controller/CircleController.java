package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	// PI => Math.PI
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return "면적 : " + c.toString() + " / " + (Math.PI * radius * radius);
	}
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius); // 필드 초기화.
		return "둘레 : " + c + " / " + (Math.PI * radius *2);
	}
}















