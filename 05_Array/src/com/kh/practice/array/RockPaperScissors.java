package com.kh.practice.array;

import java.util.Scanner;

public class RockPaperScissors {
	
	Scanner sc = new Scanner(System.in);

	private void 짱깬뽀() {
		System.out.print("input name : ");
		String name = sc.nextLine();
		String rsp[] = {"rock" , "scissors" , "paper"};
		while (true) {
			
			int num1 = (int)(Math.random()*3 + 0);

			System.out.print("rock | scissors | paper =============== ");
			String player = sc.nextLine();
			if(!(player.equals("rock") || player.equals("scissors") || player.equals("paper") )) {
				System.out.println("error");
				continue;
			}
			
			String com = rsp[num1];
			
			
			System.out.println(name + " : " + player);
			System.out.println("com : " + com);
			if (player.equals(com)) {
				System.out.println("Draw");
				continue;
			} 
			
			if ((player.equals("rock") && com.equals("scissors")) || (player.equals("scissors") && com.equals("paper")) || (player.equals("paper") && com.equals("rock"))) 
			{
				System.out.println(name + " Win!");
			} else{
				System.out.println(name + " Lose");
			}
			
		}
		
	}
	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		rps.짱깬뽀();
	}
}
