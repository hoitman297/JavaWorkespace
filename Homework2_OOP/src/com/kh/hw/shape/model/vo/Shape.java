package com.kh.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape(){
		
	}
	public Shape(int type, double width, double height) {
		this.type = type;
		this.width = width;
		this.height = height;
	}
	
	public String information() {
		return type + ", " + height + ", " + width + ", " + " color";
	}
	
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
