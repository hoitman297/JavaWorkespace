package com.kh.practice.charCheck.run;

import com.kh.practice.charCheck.exception.CharCheckException;
import com.kh.practice.charCheck.view.CharacterMenu;

public class Run {
	public static void main(String[] args) throws CharCheckException {
		CharacterMenu cm = new CharacterMenu();
		cm.menu();
	}
}
