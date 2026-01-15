package com.kh.practice.network.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {
	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("호스트명 ▼");
				String host = sc.nextLine();
				InetAddress naver[];
				try {
					naver = InetAddress.getAllByName(host);
					for (int i = 0; i < naver.length; i++) {
						System.out.println((i+1) + "번 ip " + naver[i].getHostAddress());
					}
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
