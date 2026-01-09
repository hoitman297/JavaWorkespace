package com.kh.practice.file.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		File f= new File(file);
		return f.exists();
	}
	
	public void fileSave(String file, String s) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public StringBuilder fileOpen(String file) {
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			fr = new FileReader(file);
			
			int value = 0;
			while((value = fr.read()) != -1) {
				sb.append((char)value);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			{
				try {
					fr.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		return sb;
		
	}
	
	public void fileEdit(String file, String s) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file,true);
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
