package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	Member[] m = new Member[SIZE];
	int count = 0;
	
	public int exitstMemberNum(){
		return count;
	}
	
	public boolean checkId(String inputId){
		for (int i = 0; i < count; i++) {
            if (m[i].getId().equals(inputId)) {
                return true;
            }
        }
        return false;
		
	}
	public void intsertMember(String id, String name,String password,String email, char gender,int age){
		if (count < SIZE) {
            m[count++] = new Member(id, name, password, email, gender, age);
        }
	}
	public String searchId(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i].getId().equals(id)) {
				return m[i].getId() + " " + m[i].getName()+ " " + m[i].getPassword()+ " " + m[i].getEmail()+ " " + m[i].getGender()+ " " + m[i].getAge();
			}
		}
		return "검색 결과가 없습니다.";
	}
}
