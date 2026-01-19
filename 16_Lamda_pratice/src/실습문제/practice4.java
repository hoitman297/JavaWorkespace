package 실습문제;

public class practice4 {
	public static void main(String[] args) {
		MyFunction2<String, Integer> printer = (k , a) -> {
			System.out.print(k + "님의 점수는 ");
			if(a >= 90) {
				System.out.println("A학점(" + a + ")입니다.");
			} else if(a >= 80) {
				System.out.println("A학점(" + a + ")입니다.");
			} else if(a >= 70) {
				System.out.println("A학점(" + a + ")입니다.");
			} else if(a >= 60) {
				System.out.println("A학점(" + a + ")입니다.");
			}
		};
				
		printer.accept("홍길동", 70);
		printer.accept("이순신", 88);
		
	}
	
	interface MyFunction2<K , A>{
		void accept(K k, A a);
	}
}
