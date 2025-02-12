package p0210.review;

import java.util.Scanner;

public class Gugudan3 {
	//스캐너 구구단
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력해주세요.");
		String dan = s.nextLine();
		System.out.println("입력하신 단: " + dan);
		int danNum = Integer.parseInt(dan);
		
		for(int i = 1; i<= 9; i++) {
			System.out.println(danNum + "*" + i + "=" + (danNum*i));
		}
	}

}
