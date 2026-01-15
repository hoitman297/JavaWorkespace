package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkTest {
	/*
	 	IP
	 		- 10.10.10.10 형태로 4바이트로 이루어진 주소값.
	 		- hostname : naver.com, iei.or.kr == 도메인명
	 		- InetAddress (자바에서 IP주소를 가지고 있는 클래스) 		
	 */
	
	public void test1() {
		
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println(naver.getHostAddress());
			
			InetAddress google = InetAddress.getByName("google.com");
			System.out.println(google.getHostAddress());

			InetAddress arr[] = InetAddress.getAllByName("naver.com");
			System.out.println(Arrays.toString(arr));
			
			InetAddress arr1[] = InetAddress.getAllByName("google.com");
			System.out.println(Arrays.toString(arr1));
			
			//내 컴퓨터의 ip주소를 얻어노는 방법
			// InetAddress.getLocaHost();
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void test2() {
		/*
		 	URL
		 	 - 인터넷상에 존재하는 서버들의 자원에 접근할 수 있는 주소.
		 	 - 자바에서는 URL 클래스를 통해 URL 자원을 다룰 수 있다.
		 	 - 실제 URL자원에 대한 객체를 생성하여 자원에 연결하고 데이터를 읽어올 수 있따.
		 	 
		 	 URL 구조
		 	  - https://kh-academy.co.kr/project/teamView.kh?no=5403&cpage=1
		 	  protocol : 통신규약(http, https, smtp, file, ...)
		 	  hostname : 도메인이름(ip주소) khedu.co.kr
		 	  prot : 서비스 번호. 호스트내에 특정 서비스를 가르키는 논리적인 번호.
		 	  포트번호 별로 다양한 서비스를 제공할 수 있다,.
		 	  각 트로토콜의 기본포트는 생략이 가능하다
		 	  https의 기본포트 : 443, hhtp의 기본포트 : 80, ftp의 기본 포트 : 20..
		 	  자원경로(path) : hostname과 port 내부에 자원이 존재하는 세부 경로.
		 	  								/project/teamView.kh
		 	 querystring : 자원을 얻기 위해 서버에 전달해야하는 값들
		 	 						?no = xxx & cpage = 1
		 */
		try {
			URL ur1 = new URL("https://kh-academy.co.kr/project/teamView.kh?no=5403&cpage=1");
			System.out.println(ur1.getProtocol());
			System.out.println(ur1.getHost());
			System.out.println(ur1.getPort() + "::" + ur1.getDefaultPort());
			System.out.println(ur1.getPath());
			System.out.println(ur1.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test3() {
		/*
		 	URLConnection
		 	- 네트워크상의 원격 서버와 통신하여 자원을 입출력할 수 있는 스트림을 제공하는 클래스
		 	- URL로 연결할 자원을 기술하고,  URLConnection으로 입출력 스트림을 사용하여 입출력을 할 수 있다.
		 	
		 	
		 */
		String address = "https://khedu.co.kr/upload/project/2025062514421734_0.jpg";
		BufferedInputStream br  = null;
		BufferedOutputStream bw = null;
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();

			br = new BufferedInputStream(conn.getInputStream());

			bw = new BufferedOutputStream(new FileOutputStream("project.jpg"));
			
			int data = 0;
			while ((data = br.read()) != -1) {
				bw.write(data);
			}
			System.out.println("검색결과 저장 완료.");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	
	public static void main(String[] args) {
		NetworkTest nt = new NetworkTest();
		nt.test1();
	}
}
