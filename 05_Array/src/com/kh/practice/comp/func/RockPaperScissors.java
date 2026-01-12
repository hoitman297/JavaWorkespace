package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	
	Scanner sc = new Scanner(System.in);
	
	public void rps() {
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		int win = 0;
		int loss = 0;
		int draw = 0;
		
		while(true) {
			System.out.print("가위바위보 : ");
			String rps = sc.next();
			
			if(rps.equals("exit")) {
				System.out.println((win+loss+draw)+"전 "+win+"승 "+
			draw+"무 "+loss+"패");
				break;
			}
			
			if(!(rps.equals("가위") || rps.equals("바위") || rps.equals("보"))) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			String[] computers = {"가위","바위","보"};
			int random = (int)(Math.random() * 3);
			
			System.out.println("컴퓨터 : "+computers[random]);
			System.out.println(name+" : "+rps);
			
			// 두 값이 같은 경우
			if(computers[random].equals(rps)) {
				System.out.println("비겼습니다.");
				draw++;
			}else if(computers[random].equals("가위") && rps.equals("보")
					|| computers[random].equals("보") && rps.equals("바위")
					|| computers[random].equals("바위") && rps.equals("가위")) {
				System.out.println("졌습니다 ㅠ");
				loss++;
			}else {
					System.out.println("이겼습니다.");
					win++;
				}
			}
		}
	}
class RockPaperScissors2
{
	Scanner sc = new Scanner(System.in);
	
	public void rps()
	{
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
		 * 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
		 * 사용자가 “exit”를 입력하기 전까지 가위바위보를 계속 진행하고 “exit”가 들어가면 반복을 멈추고
		 * 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 */
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.next();
		
		String ss = "가위";
		String pp = "보";
		String rc = "바위";
		
		int count = 0;
		int win = 0;
		int def = 0;
		int bb = 0;
		
		while (true)
		{
			// 1 ~ 3의 난수 추출
			int random = (int)(Math.random() * 3 + 1);
			
			// 빈 문자열
			String com = "";
			
			// 플레이어 입력을 숫자로 치환할 int형 변수
			int num = 0;
			
			// 컴퓨터가 뽑은 난수를 가위, 바위, 보로 치환
			switch (random)
			{
			case 1:
				com = ss;
				break;
			case 2:
				com = rc;
				break;
			case 3:
				com = pp;
				break;
			}	
			
			// 플레이어의 입력 받음
			System.out.print("가위바위보 : ");
			String rsp = sc.next();
			
			// 만약, 플레이어의 입력이 exit이라면
			if (rsp.equals("exit"))
			{
				// 판수, 승수, 무승부수, 패수 출력 후 탈출
				System.out.printf("%d전 %d승 %d무 %d패", count, win, bb, def);
				break;
			}
			// 만약, 플레이어의 입력이 가위, 바위, 보가 아닐 때
			else if (!(rsp.equals(rc) || rsp.equals(ss) || rsp.equals(pp)))
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			// 정상적인 입력일 때
			else
			{
				// 플레이어의 입력을 숫자로 치환
				switch (rsp)
				{
				case "가위":
					num = 1;
					break;
				case "바위":
					num = 2;
					break;
				case "보":
					num = 3;
					break;
				}
				
				// 컴퓨터가 낸 수와 플레이어가 낸 수를 출력
				System.out.println("컴퓨터 : " + com);
				System.out.printf("%s : %s\n", name, rsp);
				
				// 만약, 플레이어가 낸 수와 컴퓨터가 낸 수가 같을 경우
				if (num == random)
				{
					count++;
					bb++;
					System.out.println("비겼습니다.");
				}
				// 만약, 플레이어가 낸 수가 컴퓨터가 낸 수보다 1 큰 경우와 플레이어가 낸 수가 컴퓨터가 낸 수보다 2 작을 경우 이김
				else if ((num > random && num == random + 1) || num < random && num == random - 2)
				{
					count++;
					win++;
					System.out.println("이겼습니다!");
				}
				// 만약, 플레이어가 낸 수가 컴퓨터가 낸 수보다 1 작을 경우와 플레이어가 낸 수가 컴퓨터가 낸 수보다 2 클 경우 이김
				else if ((num < random && num == random - 1) || (num > random && num == random + 2))
				{
					count++;
					def++;
					System.out.println("졌습니다 ㅠㅠ");
				}
			}	
		}
	}
}


















