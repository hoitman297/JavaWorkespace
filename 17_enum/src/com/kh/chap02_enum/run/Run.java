package com.kh.chap02_enum.run;

import com.kh.chap02_enum.model.vo.CarColor;

public class Run {
	public static void main(String[] args) {
		System.out.println(CarColor.BLACK);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf("BLACK"));
		System.out.println(CarColor.valueOf(1));

		CarColor.RED.printTest();
	}
}
