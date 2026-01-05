package com.kh.chap02_abstract.part01.model.vo;
// 추상 메서드가 존재하는 순간 반드시 추상클래스로 정의.
public abstract class Sports {
	private int people; // 스포츠에 참여하는 선수 숫자

	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(int people) {
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	// 경기규칙을 설명하는 메서드
	// - 각 자식클래스에서 반드시 오버라이딩하여, 상세한 규칙을 출력해야한다.
	/*
	 추상메서드
	  - 몸통부가 존재하지 않는 미완성된 메서드를 의미한다.
	  - 추상메서드를 정의하기 위해선, abstract 예약어를 추가해야 한다.
	  - 만일, 클래스 내부에 추상메서드가 존재하는 경우 해당 클래스는 반드시
	  추상 클래스로 정의해야 한다.
	  
	  추상 클래스를 사용하는 경우
	  - 부모클래스를 상속하면서, 모든 자식클래스에서 공통으로 구현해야하는 메서드가 존재하는 경우
	  메서드 구현의 강제를 위해 추상클래스를 사용한다.
	  - 상속이 메인이며 메서드 강제는 서브
	 */
//	public void rule() {
//		System.out.println("경기규칙을 설명하는 메서드입니다.");
//	}

	public abstract void rule();
}

/*
	추상클래스 정리
	- 추상클래스란 미완성된 부분이 존재하는 클래스임을 의미(abstract class)
	- 미완성된 클래스이기 때문에 객체 생성은 불가능하나, 참조변수로는 사용이 가능하다
	- 추상 메서드가 포함된 경우, 클래스는 반드시 추상 클래스로 정의해야 한다.
	- 추상클래스는 "일반 필드", "일반 메서드", "생성자", "추상메서드" 로 이루어져 있다.
	- 추상클래스는 클래스의 상속이 주된 목적이며, 메서드강제구현은 곁다리.
	
	추상메서드
	- 미완성된 메서드를 의미하며, 메서드의 몸통부가 구현되어있지 않은 메서드
	- 추상메서드는 자식클래스에서 "오버라이딩"을 통하여 완성되며, 자식클래스에서
	  상속받은 추상메서드를 재정의하지 않는 경우 에러가 발생한다.
	- 추상메서드를 통해 클래스간의 통일성을 확보할 수 있다.
*/
