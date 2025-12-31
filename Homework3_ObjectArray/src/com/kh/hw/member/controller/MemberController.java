package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	int count = 0;
	Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	public int exitstMemberNum(){
		return count;
	}
	public boolean checkId(String inputId){
		boolean x = false;
		if((m[0].getId()).equals(inputId)) {
			for (int i = 0; i < m.length; i++) {
				if (inputId.equals(m[i].getId())) {
					x = true;
					break;
				}else {
					x = false;
				}
			}
		}
		return x;
		
	}
	public void intsertMember(String id, String name,String password,String email, char gender,int age){
		int i = 0;
		m[i++] = new Member(id, name, password, email, gender, age);
	}
}
