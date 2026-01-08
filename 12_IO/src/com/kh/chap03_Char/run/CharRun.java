package com.kh.chap03_Char.run;

public class CharRun {
	/*
	 	문자 기반 스트림
	 		- 외부매체를 지정하여 외부매체와 연결하는 역할을 수행
	 		- 연결된 외부매체와 2byte단위로 데이터를 주고받는 역할을 수행
	 		- XXXReader / XXXWriter
	 		
	 */
	public static void main(String[] args) {
		FileCharDao fcd = new FileCharDao();
		fcd.fileSave();
		fcd.fileRead();
	}
}
