package com.kh.practice.score.controller;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.kh.practice.score.model.dao.ScoreDAO.ScoreDAO;

public class ScoreController {
	ScoreDAO sd = new ScoreDAO();
		public void saveScore(String name,int kor,int eng,
				int math,int sum,double avg) {
			sd.saveScore(name, kor, eng, math, sum,avg);

		}
		
		public DataInputStream readScore()  throws FileNotFoundException{
			DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"));
			return dis;
		}
}
