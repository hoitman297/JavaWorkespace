package com.kh.operator;

public class F_Triple {
	
	/*
	 * 삼항연산자 
	 *  - 3개의 항목을 가지고 연산하는 연산자
	 *  [표현법]
	 *  조건식 ? 조건이 true인 경우 결과갑 : 조건이 false인 경우 결과값
	 *   A ? B : C 
	 */
	
	public void mehod1() {
		int num = 50;
		
		// num의 값이 양수인지 아닌지 판단.
		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다." : "음수입니다.");
		
	}
	
	public void method2() {
		int num = 0;
		
		//num의 값이 양수, 음수, 0중 무엇인지 판단
		String result = num > 0 ? "양수" : (num < 0 ? "음수" : "0입니다.");
	}
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; // c = 16, a = 6, b = 10
        int d = c / a; // d = 2
        int e = c % a; // e = 4
        int f = e++; // f = 4, e = 5
        int g = (--b) +(d--); // g = 11, b = 9, d = 1 
        int h = 2;
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
        // a = 6, b = 9, c = 16, d = 1, e = 5 , f = 4 , g= 11, h = 2
        // 6 + 9 /(15 / 4) * (11 - 1) % (6 + 2) =
        // i = 2
        // a = 7, b = 9, c = 15, f = 4, g = 10, d = 1, e = 6, h = 2 i =2
        System.out.println("a : "+a);//7
        System.out.println("b : "+b);//9
        System.out.println("c : "+c);//15
        System.out.println("d : "+d);//1
        System.out.println("e : "+e);//6
        System.out.println("f : "+f);//4
        System.out.println("g : "+g);//10
        System.out.println("h : "+h);//2
        System.out.println("i : "+i);//12
    }
	public static void main(String[] args) {
		F_Triple ft = new F_Triple();
		ft.quiz();
	}
}
