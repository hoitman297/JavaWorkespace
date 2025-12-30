package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();
	public double calcArea(double height,double width) {
		s.setHeight(height);
		s.setHeight(width);
		return (height * width)/2;
	}
	
	public void paintColor() {
		
	}
	
	public String print() {
		
	}
}
