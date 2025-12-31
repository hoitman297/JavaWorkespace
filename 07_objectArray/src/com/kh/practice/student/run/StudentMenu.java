package com.kh.practice.student.run;

import java.util.Scanner;

import com.kh.practice.student.controller.Student;
import com.kh.practice.student.model.vo.StudentController;

public class StudentMenu {
	StudentController ssm = new StudentController();
	
	public StudentMenu() {
        Student[] sArr = ssm.printStudent(); 
        for(Student s : sArr) {
        	System.out.println(s.inform());
        }
        System.out.println(ssm.sumScore());
        System.out.println(ssm.avgScore()[1]);
        for(Student s : sArr) {
        	if (s.getScore() < ssm.CUT_LINE) {
    			System.out.println(s.getName() + " 불합격");
    		} else {
    			System.out.println(s.getName() + " 합격");
    		}
        }
        
	}
	
	
}
