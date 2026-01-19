package 실습문제;

import java.util.function.BiFunction;

public class practice5 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> op = getOperator("+");
		System.out.println(op.apply(15, 5));
		
		op = getOperator("*");
		System.out.println(op.apply(10, 5));
	}

	public static BiFunction<Integer, Integer, Integer>getOperator(String type){
		if(type.equals("+")) {
			return (Integer x,Integer y) -> x + y;
		}else if(type.equals("*")) {
			return (Integer x,Integer y) -> x * y;
		}else if(type.equals("-")) {
			return (Integer x,Integer y) -> x - y;
		}else if(type.equals("/")) {
			return (Integer x,Integer y) -> x / y;
		}
		return null;
	}
}
