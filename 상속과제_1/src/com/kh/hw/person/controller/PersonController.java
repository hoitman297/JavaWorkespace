package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student s[] = new Student[3];
	private Employee e[] = new Employee[10];
	private  int count = 0;

	
	public int[] personCount() {
		
	}
	
	public void inserStudent(String name, int age, double height, double weight,int salary, String dept) {
		s[count++] = new Student(name, age, height, weight, salary, dept);
	}
	
	public Student[] printStudent() {
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int grade, String major) {
		e[count++] = new Employee(name, age, height, weight, grade, major);
	}
	
	public Employee[] printEmployee() {
		
	}
	
}
