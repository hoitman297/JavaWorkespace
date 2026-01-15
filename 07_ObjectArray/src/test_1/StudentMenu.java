package test_1;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	public StudentMenu() {
		System.out.println("====== 학생 정보 출력 ======");
		ssm.printStudent();
		
		System.out.println("====== 학생 성적 출력 ======");
		System.out.print("학생 점수 합계 : " + ssm.sumScore());
		System.out.print("학생 점수 평균 : "+ ssm.avgScore()[1]);
		
		System.out.println("====== 성적 결과 출력 ======");
		for (Student s : ssm.printStudent()) {
			if(s.getScore() >= ssm.CUT_LINE) {
				System.out.println(s.getName() + " 시험 통과");
			} else {
				System.out.println(s.getName() + " 재시험");
			}
		}
		
	}
}

