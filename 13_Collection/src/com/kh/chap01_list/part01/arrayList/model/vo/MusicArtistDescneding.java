package com.kh.chap01_list.part01.arrayList.model.vo;

import java.util.Comparator;

public class MusicArtistDescneding implements Comparator<Music>{

	@Override
	public int compare(Object o1, Object o2) {
		//1. 오름차순
		// o1 비교메서드 o2
		
		//2. 내림차순
		// o2 비교메서드 o1
		Music m1 = (Music) o1;
		Music m2 = (Music) o2;
		int result = m1.getTitle().compareTo(m2.getTitle());
		
		if(result == 0) {
			result = m1.getSinger
		}
	}




}
