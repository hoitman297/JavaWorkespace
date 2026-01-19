package 실습문제;

public class practice2 {
	public static void main(String[] args) {
		int num1 =(int)(Math.random()*10 + 1), num2 = (int)(Math.random()*10 + 1);
		System.out.println(num1 + " / " + num2);
		Calculator<Integer> adder = (v1,v2) ->  v1 * v2;
		System.out.println(adder.operate(num1, num2));
		
		Calculator<Integer> findMax = (v1,v2) -> Math.max(v1, v2);
		System.out.println(findMax.operate(num1, num2));
		
		Calculator<String> combiner =  (v1,v2) -> v1 + "-" + v2;
		System.out.println(combiner.operate("hello", "world"));
	}
	
	@FunctionalInterface
	interface Calculator<V>{
		V operate(V v1, V v2);
	}
}
