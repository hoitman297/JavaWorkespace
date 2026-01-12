package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];// [null, null, null]
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
//		각 객체배열에 저장된 객체의 수를 
//		정수배열에 담아 반환하는 메소드 
		int[] arr = new int[2];// [0,0]
		
		// 1. 학생숫자를 세서 저장.
		int count = 0;
		for(Student std : s) {
			if(std != null) {
				count++;
			}
		}
		arr[0] = count;
		
		count = 0;
		for(Employee emp : e) {
			if(emp != null) {
				count++;
			}
		}
		arr[1] = count;
		
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for(int i = 0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = std;
				break;
			}
		}
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, int salary, String dept) {
		
	}
	
	public Employee[] printEmployee() {
		return e;
	}
	
}