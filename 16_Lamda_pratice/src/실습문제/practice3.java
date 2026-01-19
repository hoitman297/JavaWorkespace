package 실습문제;

public class practice3 {
	public static void main(String[] args) {
		String str = "apple";
		MyFunction<String, String> first = s -> s.toUpperCase();
		System.out.println(first.apply(str));
		MyFunction<String, Boolean> second = s -> str.length() >= 5;
		System.out.println(second.apply(str));
		MyFunction<String, String> third = s -> String.join("-", s.split(""));;
		System.out.println(third.apply(str));		
	}
	
	@FunctionalInterface
	interface MyFunction<V ,B>{
		B apply(V v);
	}

}
