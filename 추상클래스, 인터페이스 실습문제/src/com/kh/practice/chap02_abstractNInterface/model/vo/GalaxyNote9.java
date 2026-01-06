package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		setMaker("삼성");
	}


	public String printInformation() {
		String result = "갤럭시 노트9은 " + getMaker() + makeCall() +  makeCall() + takeCall() + picture() + charge()	+touch();
		return null;
	}


	public String touch() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1300만 화소";
	}


	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}
}
