package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	Scanner sc = new Scanner(System.in);
	ScoreController scr = new ScoreController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 성적 저장");
			System.out.println("2. 성적 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");

			int num = sc.nextInt();

			if (num == 1) {
				saveScore();
			} else if (num == 2) {
				readScore();
			} else if (num == 9) {
				return;
			} else {
				System.out.println("다시 입력해주세요.");
				return;
			}

		}
	}

	public void saveScore() {
		int num = 0;
		while (true) {
			System.out.println((++num) + "번째 학생 정보 기록");
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();

			System.out.print("영어 점수 :  ");
			int eng = sc.nextInt();

			System.out.print("수학 점수 : ");
			int math = sc.nextInt();

			scr.saveScore(name, kor, eng, math, kor + eng + math, (kor + eng + math) / 3);
			System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			char ch = sc.next().charAt(0);
			if (ch == 'n' || ch == 'N') {
				return;
			} else if (ch == 'y' || ch == 'Y') {
				continue;
			}
		}

	}

	public void readScore() {
		int count = 0; // 몇 명의 학생인지 (반복문이 몇 번 실행됐는지) 담을 변수
		int sumAll = 0;
		double avgAll = 0.0; // 모든 학생들의 합과 평균을 담을 변수

		try (DataInputStream dis = scr.readScore();) {
			while (true) {
					System.out.print(dis.readUTF() + "\t"
							+ dis.readInt() + "\t" + dis.readInt() + "\t" + dis.readInt());
					int sum = dis.readInt();
					double avg = dis.readDouble();
					System.out.println("\t" + sum + "\t" + avg);
					
					count++;
					sumAll += sum;
					avgAll += avg;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("잃은 횟수 \t 전체합계 \t 전체평균");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
