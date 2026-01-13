package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	// 회원 정보를 저장할 HashMap (Key: 아이디, Value: Member 객체)
	private HashMap<String, Member> map = new HashMap<String, Member>();

	/**
	 * 회원가입 처리 메서드
	 * 전달 받은 id가 없다면 map에 추가 후 true 반환, 있다면 false 반환
	 */
	public boolean joinMembership(String id, Member m) {
		// id가 map에 포함되어 있지 않다면 (중복이 아니라면)
		if (!map.containsKey(id)) {
			map.put(id, m); // 데이터 저장
			return true;
		}
		// 이미 존재하는 아이디라면
		return false;
	}

	/**
	 * 로그인 처리 메서드
	 * id 존재 여부 확인 후 비밀번호 비교. 성공 시 이름 반환, 실패 시 null 반환
	 */
	public String logIn(String id, String password) {
		// 1. 아이디가 존재하는지 확인
		if (map.containsKey(id)) {
			// 2. 해당 아이디의 비밀번호와 입력받은 비밀번호가 같은지 확인
			if (map.get(id).getPassword().equals(password)) {
				// 로그인 성공: 회원의 이름 반환
				return map.get(id).getName();
			}
		}
		// 아이디가 없거나 비밀번호가 틀린 경우
		return null;
	}

	/**
	 * 비밀번호 변경 메서드
	 * 아이디와 기존 비번 일치 시 새 비번으로 변경 후 true, 실패 시 false
	 */
	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하고, 저장된 비밀번호가 입력한 기존 비밀번호(oldPw)와 일치한다면
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			// 새로운 비밀번호로 변경 (Setter 사용)
			map.get(id).setPassword(newPw);
			return true;
		}
		// 조건 불일치 시 실패
		return false;
	}

	/**
	 * 이름 변경 메서드
	 * 전달 받은 id가 존재하면 이름을 변경함
	 */
	public void changeName(String id, String newName) {
		// 아이디가 존재하는 경우에만
		if (map.containsKey(id)) {
			map.get(id).setName(newName); // 이름 변경
		}
	}

	/**
	 * 같은 이름 회원 찾기 메서드
	 * 전달 받은 이름과 같은 회원을 찾아 TreeMap에 담아 반환 (오름차순 정렬)
	 */
	public TreeMap<String, String> sameName(String name) {
		// 결과를 담을 TreeMap 생성 (Key 기준 오름차순 자동 정렬)
		TreeMap<String, String> result = new TreeMap<String, String>();
		
		// map의 모든 키(ID)를 가져옴 (요구사항: keySet() 사용)
		Set<String> keys = map.keySet();
		
		// 키들을 순회하며 이름 비교
		for (String key : keys) {
			// 해당 키(ID)를 가진 멤버의 이름이 검색하려는 이름과 같다면
			if (map.get(key).getName().equals(name)) {
				// 결과 맵에 (아이디, 이름) 저장
				result.put(key, map.get(key).getName());
			}
		}
		
		return result;
	}
}