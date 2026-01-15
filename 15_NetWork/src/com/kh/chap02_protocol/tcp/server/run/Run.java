package com.kh.chap02_protocol.tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {
    public static void main(String[] args) {
        int port = 30000;
        ServerSocket server = null;
        
        try {
            server = new ServerSocket(port);
            System.out.println("### 서버 시작 ###");
            
            while(true) {               
                System.out.println("### 클라이언트의 요청 대기 중 ###");
                Socket client = server.accept();
                System.out.println("### 클라이언트와 연결됨 ! ###");
                System.out.println("클라이언트의 ip주소 : " + client.getInetAddress().getHostAddress());
                
                // try-with-resources에 client도 포함시켜야 통신 종료 시 소켓이 제대로 닫힘
                try(Socket c = client; 
                    BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
                    PrintWriter pw = new PrintWriter(c.getOutputStream(), true);) {
                    
                    while(true) {
                        String message = br.readLine();
                        
                        // 1. null 체크 추가 (클라이언트가 강제 종료했을 때 대비)
                        if(message == null) {
                            System.out.println("클라이언트와 연결이 끊겼습니다.");
                            break;
                        }
                        
                        // 2. 안전한 비교 방식으로 변경 (NullPointerException 방지)
                        if("exit".equals(message)) {
                            System.out.println("접속 종료");
                            break;
                        }
                        
                        System.out.println("메세지 : " + message);
                        pw.println("메세지 받기 성공");
                    }
                } catch (IOException e) {
                    System.out.println("클라이언트와 통신 중 오류 발생");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}