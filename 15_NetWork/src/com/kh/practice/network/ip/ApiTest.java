package com.kh.practice.network.ip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ApiTest {
    public static void main(String args[]) {
        String serviceKey = "bc8bd6249b956ddc65154b662b8e4cef5027bbd1475a49e98d852332f38452d9";
        String endpoint = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";

        try {
            StringBuilder urlBuilder = new StringBuilder(endpoint);
            urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey);
            urlBuilder.append("&" + URLEncoder.encode("returnType", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("searchDate", "UTF-8") + "=" + URLEncoder.encode("2026-01-15", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("ver", "UTF-8") + "=" + URLEncoder.encode("1.1", "UTF-8"));

            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();

            // --- XML 파싱 시작 ---
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(sb.toString())));
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("item");

            System.out.println("================================ 미세먼지 예보 정보 ================================");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("▶ 발표 시간: " + getTagValue("dataTime", eElement));
                    System.out.println("▶ 예보 날짜: " + getTagValue("informData", eElement));
                    System.out.println("▶ 항목: " + getTagValue("informCode", eElement));
                    System.out.println("▶ 통보 요약: " + getTagValue("informOverall", eElement));
                    System.out.println("▶ 지역별 등급: " + getTagValue("informGrade", eElement));
                    System.out.println("----------------------------------------------------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // XML 태그 안의 값을 가져오는 도우미 메소드
    private static String getTagValue(String tag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();
        Node nValue = (Node) nlList.item(0);
        if (nValue == null) return "데이터 없음";
        return nValue.getNodeValue();
    }
}