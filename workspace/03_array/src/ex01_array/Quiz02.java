package ex01_array;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] friendList = { "타요", "짱구", "스폰지밥" };

		System.out.print("새로 사귄 친구가 몇 명?>>");
		int newFriend = sc.nextInt();

		String[] temp = new String[friendList.length + newFriend];

		for (int i = 0; i < friendList.length; i++) {
			temp[i] = friendList[i];
		}

		for (int i = 3; i < temp.length; i++) {
			System.out.print("새로 사귄 친구 이름 입력>>");
			temp[i] = sc.next();
		}

		friendList = temp; // 새로운 배열로 갈아탑니다.
		
		/*
		for (int i = 0; i < friendList.length; i++) {
			System.out.println(friendList); 
		}
		*/

		for (String friend : friendList) {
			System.out.println(friend);
		}

		sc.close();

	}

}
