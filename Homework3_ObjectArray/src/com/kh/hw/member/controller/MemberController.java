package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	Member[] m = new Member[SIZE]; //[new Member, null, null, null]
	public int count = 0;

	public int exitstMemberNum() {
		// 현재 존재하는 멤버 수 반환
		
		/*
		 * int count = 0; 
		 * 
		 * for(Member mem : m) { 
		 * // 객체가 초기화 된 경우 if(mem != null)
		 *  { count++; } 
		 *  }
		 */
		
		return count;
	}

	public boolean checkId(String inputId) {
		//아이디 중복 확인하는 메소드
		/*
		 * for(Member men : m){
		 *	(객체배열에 저장된 Menber객체의 id값과 사용자가 입력한 id값을 비교.)
		 *
		 *	if(mem != null && inputId.equals(mem.getId()))
		 *	isDup = true;
		 *	break;
		 *	}
		 * 		}
		 */
		
		
		for (int i = 0; i < count; i++) {
			if (m[i].getId().equals(inputId)) {
				return true;
			}
		}
		return false;

	}

	public void intsertMember(String id, String name, String password, String email, char gender, int age) {
		if (count < SIZE) {
			m[count++] = new Member(id, name, password, email, gender, age);
		}
	}

	public String searchId(String id) {
		for (int i = 0; i < count; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				return m[i].getId() + " " + m[i].getName() + " " + m[i].getPassword() + " " + m[i].getEmail() + " "
						+ m[i].getGender() + " " + m[i].getAge();
			} else if (m[i] == null) {
				break;
			}
		}
		return "검색 결과가 없습니다.";
	}

	public Member[] searchName(String name) {

		for (int i = 0; i < count; i++) {
			if (m[i].getName().equals(name)) {
				return m;
			}
		}
		return null;
	}

	public Member[] searchEmail(String email) {

		for (int i = 0; i < m.length; i++) {
			if (m[i].getEmail().equals(email)) {
				return m;
			}
		}
		return null;
	}

	public boolean updatePassword(String id, String password) {
		for (int i = 0; i < count; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for (int i = 0; i < count; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for (int i = 0; i < count; i++) {
			if (m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		
		for (int i = 0; i < count; i++) {
			if (m[i].getId().equals(id)) {
				for (int j = i; j < count - 1; j++) {
					m[j] = m[j+1];
				}
				m[count-1] = null;
				--count;
				return true;
			}
		}
		return false;
	}

	public void delete() {
		for (int i = 0; i < count; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {
		return m;
	}
}
