package ex02_String;

import java.util.Scanner;

// 1. 시간을 입력 받아서 출력하기
// 시간>> 9
// 분 >> 5
// 초 >> 30
// 9:05:30

public class Quiz01 {

	public static void main(String[] args) {

		int hour;
		int minute;
		int second;
		Scanner sc = new Scanner(System.in);

		System.out.print("시간>>");
		hour = sc.nextInt();
		System.out.print("분>>");
		minute = sc.nextInt();
		System.out.print("초>>");
		second = sc.nextInt();

		String strHour = hour + ""; // String.valueOf(hour);
		String strMinute = minute + "";
		String strSecond = second + "";

		if (strMinute.length() == 1) { // if (minute < 10)
			strMinute = "0" + strMinute;
		}
		if (strSecond.length() == 1) { // if (minute < 10)
			strSecond = "0" + strSecond;
		}

		System.out.println(strHour + ":" + strMinute + ":" + strSecond);
		sc.close();
		
	}

}
