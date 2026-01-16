package com.kh.chap03_protocol.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.CollationElementIterator;

public class ServerRun {
	/*
	 	UDP
	 	- 비연결형프로토콜로 클라이언트가 데이터를 받았는지 아닌지 상관하지 않는 방식의 프로토콜
	 	- 데이터 전송의 신뢰도가 낮으며, 데이터 손시리 발생할 수 있다.
	 	- 번거러운 확인절차를 없앰으로써, 신속하게 데이터를 전달할 수 있다.
	 	- 빠른 데이터 전송이 중요한 실시간 스트리밍, 게임 등에서 사용된다.
	 	
	 	DatagramSocket
	 	- UDP통신에서 DatagramPacket을 보내고 받는데 사용하는 클래스
	 	- UDP는 DatagramPacket단위로 데이터를 송/수신 할 수 있다.
	 	
	 	DatagramPacket
	 	- UDP통신시 데이터를 포장하는 클래스
	 	- 전송할 데이터(byte[]) 와 호스트와 ip주소 및 포트번호를 함께 전송한다.
	 	
	 */
	
	public static void main(String[] args) {
		//서버 포트 번호
		int severPort = 30100;
		
		try {
			DatagramSocket socket = new DatagramSocket(severPort);
			
			byte [] data = new byte[1024];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			socket.receive(packet);
			
			InetAddress clientAddress = packet.getAddress();
			System.out.println("clientAddress : " + clientAddress.getHostAddress() + "port " + packet.getPort());
			
			String str = "UDP Server에서 전송하는 데이터";
			
			byte[] serverData = str.getBytes();
			DatagramPacket packet2 = new DatagramPacket(serverData,serverData.length, clientAddress, packet.getPort());
			socket.send(packet2);
			
			socket.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
