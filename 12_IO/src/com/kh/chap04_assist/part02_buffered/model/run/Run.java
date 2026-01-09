package com.kh.chap04_assist.part02_buffered.model.run;

import com.kh.chap04_assist.part02_buffered.model.dao.ObejctDao;
import com.kh.chap04_assist.part02_buffered.model.dao.ObjectDao;

public class Run {
	public static void main(String[] args) {
		ObjectDao dao = new ObjectDao();
//		dao.fileSave();
//		dao.fileRead();
		ObejctDao dao2 = new ObejctDao();
		dao2.fileSave();
		dao2.fileSave();
	}
}
