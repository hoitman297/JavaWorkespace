package com.kh.example.practice2.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public void Studnet(){
		grade = 2;
		this.classroom = 2;
		name = "명지원";
		this.height = 190.5;
		gender = 'M';
	}
	public void information() {
		System.out.println(grade);
		System.out.println(classroom);
		System.out.println(name);
		System.out.println(height);
		System.out.println(gender);
	}
	
}
