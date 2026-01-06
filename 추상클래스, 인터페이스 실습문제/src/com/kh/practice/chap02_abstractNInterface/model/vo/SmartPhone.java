package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements TouchDisplay,CellPhone{
	private String maker;
	public SmartPhone(){
		
	}
	


	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public abstract String printInformation();
	
}
