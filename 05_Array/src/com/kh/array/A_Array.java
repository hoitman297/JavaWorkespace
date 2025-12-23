package com.kh.array;

public class A_Array {
	public void method1() {
		int a;
		int arr[];
		int [] arr1;
		
		arr = new int[5];
		int arr3 [] = new int[5]; // [0, 0, 0, 0, 0]
		
		System.out.println(arr3[3]);
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		
		System.out.println(arr3); //참조형 변수
	}
	
	public void method2() {
		int num = 10;
		
		int iArr [] = new int[5]; //00000
		int iArr2[] = new int[11];
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 HashCode : " + iArr.hashCode());//주소값을 10진수로 변경해주는 함수
		System.out.println("iArr의 HashCode : " + iArr2.hashCode());//주소값을 10진수로 변경해주는 함수
		int iArr3[] = iArr2;
		System.out.println(iArr3.hashCode());
	}
	public static void main(String[] args) {
		A_Array aa = new A_Array();
		aa.method2();
	}
}
