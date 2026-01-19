package 실습문제;

public class practice1 {
	public static void main(String[] args) {
        String[] arr = { "java", "lambda", "hi", "functional", "wow" };
        System.out.println("--- 1. 길이 3 이하 ---");
        printStrings(arr, str -> str.length() <= 3);

        // 2. 문자열에 "a"가 포함된 단어만 출력
        System.out.println("\n--- 2. 'a' 포함 ---");
        printStrings(arr, str -> str.contains("a"));

        // 3. 문자열이 "w"로 시작하는 것만 출력
        System.out.println("\n--- 3. 'w'로 시작 ---");
        printStrings(arr, str -> str.startsWith("w"));

        // 4. 문자열 길이가 짝수이면서 "a"가 포함된 단어만 출력
        System.out.println("\n--- 4. 길이 짝수 + 'a' 포함 ---");
        printStrings(arr, str -> str.length() % 2 == 0 && str.contains("a"));
    }

    public static void printStrings(String[] arr, StringChecker checker) {
        for (String str : arr) {
            if (checker.check(str)) {
                System.out.println(str);
            }
        }
    }

    @FunctionalInterface
    interface StringChecker {
        boolean check(String str);
    }
}
