package ezen;

import java.util.Scanner;

public class Scanner5 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 숫자를 써주세요 : ");
		String numStr = s.nextLine();
		
		System.out.println("입력한 숫자 : " + numStr);
		
		// 쓴 숫자부터 시작해서 0까지 출력하는 반복문을 만들어주세요
		int max =  Integer.parseInt(numStr);
		for(int i=max; i>=0; i--) {
			System.out.println(i);
			
		}
	}

}
