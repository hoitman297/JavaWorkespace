package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCralwer {
	/*
	 	URL을 활용한 웹 크롤링
	 		- 웹페이지를 탐색하여 HTML내부의 원하는 데이터를 추출하는 작업
	 		- 수집한 데이터를 분석하기 위하여 사용한다.
	 		- 다만 웹페이지의 소유주나 운영자의 허락없이 크롤링시 법적 책임이 따를 수 있다.
	 */
	
	public void test1() {
        String address = "https://khedu.co.kr/project/team.kh";
        List<String> imgList = new ArrayList<>(); 
        
        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            
            StringBuilder sb = new StringBuilder();
            String line = null;
            while((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            
            // 정규표현식 수정: \s 사용 시 이스케이프 문자 처리 확인
            String regex = "<img\\s+src=\"([^\"]+)\"";
            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(sb);

            while (match.find()) {
                String image = match.group(1);
                imgList.add(image);
            }
            System.out.println("검색 완료, 개수: " + imgList.size());

            saveFile(imgList);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	private void saveFile(List<String> imgList) {
		for(String imgPath : imgList) {
			
			if(!imgPath.startsWith("/upload/project/")) {
				continue;
			}
			String fileName = imgPath.substring(imgPath.lastIndexOf("/"));
			String savePath = "C:/upload/kh/project/" + fileName;
			
			File dir = new File(savePath);
			if(dir.exists()) {
				dir.mkdirs(); //디렉토리 생성
			}
			
			try {
				URL url = new URL("https://khedu.co.kr" + imgPath);
				URLConnection conn = url.openConnection();
				
				try(BufferedInputStream is = new BufferedInputStream(conn.getInputStream());
						BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(dir + fileName));
						){
					int value = 0;
					while((value = is.read()) != -1) {
						os.write(value);
					}
					System.out.println(fileName + "저장완료");
				}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		WebCralwer wc = new WebCralwer();
		wc.test1();
	}
}
