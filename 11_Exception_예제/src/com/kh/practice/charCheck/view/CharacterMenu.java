package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu{
	CharacterController cc = new CharacterController();
	Scanner sc = new Scanner(System.in);
	
	public void menu() throws CharCheckException{
		try {
			System.out.println("아무 문자열 입력해 보세요 :");	
			
			String str = sc.nextLine();
			System.out.println(str + "에 포함된 영문가 개수 : " + cc.countAlpha(str));
		} catch (CharCheckException c) {
			c.printStackTrace();

		}
	}
}
