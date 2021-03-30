package ex01_network;

import java.net.URL;

public class URLMainClass {

	public static void main(String[] args) {

		// URL : Uniform Resource Locator
		// 형식이 정햐져 있는 자원의 표기방법
		// 프로토콜://호스트:포트?파라미터
		
		URL url = null;
		URL url2 = null;

		try {
			url = new URL("https://www.naver.com?query=java&page=3");
			System.out.println(url.getHost());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getProtocol());
			System.out.println(url.getQuery());
			
			url2 = new URL("https://www.naver.com/webtoon/web.jsp");
			System.out.println(url2.getFile());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
