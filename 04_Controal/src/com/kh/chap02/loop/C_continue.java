package com.kh.chap02.loop;

import java.util.Iterator;

public class C_continue {
 /* continue:
  *  프로그램 실행 중 continue문을 만나게 되면, 그 뒤에 있는 코드들을 실행하지 않고
  *  가장 가까운 반복문으로 돌아가서 재실행
  *  break와 비슷한 개념
  */
	private void 제1메소드() {
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}
	}
	public static void main(String[] args) {
		C_continue cc = new C_continue();
		cc.method2();
	}
	public void method2() {
		int sum = 0;
		// 1부터 100까지의 총 합계를 구하라
		// 단, 6의 배수는 제외하고 더하기
		for (int i = 1; i <= 100; i++) {
			if(i%6 == 0) continue;
			sum += i ;
			System.out.println(i);
		}
		System.out.println(sum);
	}
}
