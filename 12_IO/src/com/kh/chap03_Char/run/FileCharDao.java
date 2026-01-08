package com.kh.chap03_Char.run;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	public void fileSave() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt", true);// 파일이 없다면 생성, 이어쓰기,
			fw.write("재밌는 io시간...");
			fw.write("잘 즐기고 계신가요...");
			fw.write(' ');
		} catch(IOException e ){
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			int value = 0;
			while((value = fr.read()) !=  -1) {
				System.out.print((char)value);
			}
			
			fr.read();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
