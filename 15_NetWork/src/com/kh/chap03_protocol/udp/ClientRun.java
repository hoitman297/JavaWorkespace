package com.kh.chap03_protocol.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.naming.ldap.SortKey;

public class ClientRun {
	public static void main(String[] args) {
		int serverPort = 30001;

		
		
		try {
			InetAddress server = InetAddress.getByName("localhost");
			DatagramSocket socket = new DatagramSocket();
			String message = "데이터 전송 요청";
			byte[] sendDate = message.getBytes();
			
			DatagramPacket sendPacket = new DatagramPacket(sendDate, sendDate.length,server,serverPort);
			
			socket.send(sendPacket);
			
			byte[] data = new byte[1024];
			DatagramPacket receiveData = new DatagramPacket(data,data.length);
			
			socket.receive(receiveData);

			String receive = new String(receiveData.getData(), 0 , receiveData.getLength());
			System.out.println(receiveData);
			
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
