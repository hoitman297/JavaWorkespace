package com.kh.chap04_assist.part02_buffered.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_buffered.model.vo.Phone;

public class ObjectDao {
	
	public void fileSave() {
		//파일에 저장할 객체
		Phone p = new Phone("아이폰", 130000, "1234");
		
		//ObjectOutputStram : 객체단위 입출력을 지원하는 보조 스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));){
			
			oos.writeObject(p);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"));){
			Phone p = (Phone) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
