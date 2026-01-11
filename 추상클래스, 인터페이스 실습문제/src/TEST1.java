import java.util.Scanner;

public class TEST1 {
	Scanner sc  = new Scanner(System.in);
	public void method9() {
	    System.out.print("");
	    int a = sc.nextInt();
	    System.out.print("");
	    int b = sc.nextInt();
	    System.out.print("");
	    int test = sc.nextInt();
	    System.out.print("");
	    int student = sc.nextInt(); //20회 전체 비율에 20퍼를 차지함
	    												

	    double a1 = a * 0.2;
	    double b1 = b * 0.3;
	    double test2 = test * 0.3;

	    double sum = a1+b1+test2+student;

	    
	    if(20 - student > (20 * 0.3)) {
	    	
	    }
	    
	    System.out.println("============ 결과 ============");
	    System.out.print("중간 고사 점수(20) :"+a1);
	    System.out.print("기말 고사 점수(30) :"+b1);
	    System.out.print("과제 점수 (30) :"+test2);
	    System.out.print("출석 점수 (20) :"+student);
	    System.out.print("총점 :"+sum);
	    System.out.println();
	}

	public static void main(String[] args) {
		
	}
}
