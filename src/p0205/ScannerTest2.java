package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		Random r = new Random();
		int rNum = r.nextInt(10)+1;
		if (rNum == num) {
			System.out.println("맞췄다");
		} else if (rNum > num) {
			System.out.println("업");
		} else if (rNum < num) {
			System.out.println("다운");
		} 
		System.out.println("난수 : " + rNum);
	}

}
