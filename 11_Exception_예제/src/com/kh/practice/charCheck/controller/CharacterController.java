package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController(){
		
	}
	
	public int countAlpha  (String s) throws CharCheckException { //throws : 난 모르겠고, 나 부른 사람이 처리해
		
		//다른 방법
//		if(s.contains(" ")) {//contains : 포함되어있니?
//			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
//		}
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
            // 대문자 혹은 소문자인지 확인
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                count++;
            } else if(ch == ' ') {
    			throw new CharCheckException("문자열에 공백이 포함되어 있습니다.");
            }
		}
		return count;
	}
	
}
