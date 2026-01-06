package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student s[] = new Student[3];
	private Employee e[] = new Employee[10];

	public int[] personCount() {
		int arr[] = new int[2];
		int count = 0;

		for (Student std : s) {
			if (std != null) {
				count++;
			}
		}
		arr[0] = count;

		count = 0;
		for (Employee emp : e) {
			if (emp != null) {
				count++;
			}
		}
		arr[1] = count;

		return arr;
	}

	public void inserStudent(String name, int age, double height, double weight, int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = std;
				break;
			}
		}
	}

	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = std;
				break;
			}
		}
	}

	public Employee[] printEmployee() {

	}

}
