package p0210;

import java.util.Scanner;

public class Gugudan3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("단을 입력해주세요 : ");
		String dan = s.nextLine();
		System.out.println("입력하신 단은 " + dan + "입니다.");
		int danNum = Integer.parseInt(dan);
		for(int i = 1; i<=danNum; i++) {
			for(int j = 1; j<=danNum; j++) {
			System.out.println(i + " * " + j + " = " + (j*i));
			}
		}
		
	}
}
