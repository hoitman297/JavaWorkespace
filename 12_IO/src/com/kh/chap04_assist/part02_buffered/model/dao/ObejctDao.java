package com.kh.chap04_assist.part02_buffered.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_buffered.model.vo.Phone;

public class ObejctDao {
	public void fileSave() {
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("아이폰", 150000, "1111");
		arr[1] = new Phone("갤럭시", 100000, "1111");
		arr[2] = new Phone("갤럭시플립", 120000, "1111");
		
		try(ObjectOutputStream oos
				= new ObjectOutputStream(new FileOutputStream("phone_arr.txt"));){
			
			for(Phone p : arr) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone_arr.txt"));){
		//더이상 읽어들일 객체가 없는 경우, EOFException을 발생시킨다.
			while(true) {
				Phone p = (Phone)ois.readObject();
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("읽을 객체가 없습니다."); //아래에 있으면 오류
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("읽을 객체가 없습니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
