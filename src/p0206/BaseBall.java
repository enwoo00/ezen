package p0206;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		//int[] nums라는 배영ㄹ변수에
		//0-9까지의 난수 3개를 입력하시고
		//아래에서 비교하여 볼 스트라이크를 출력하고
		//3개의 숫자와 자리수까지 다 맞으면 아웃이라고 출력후 반복문이 끝나면 됩니다.
		int[] nums = new int[3];
		Random r = new Random();
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(10); //0-9
		}
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 3개: ");
			String num = s.nextLine();
			System.out.println("네가 쓴 숫자 3개: " + num);
			
			String strs[] = num.split(","); 
			int num1 [] = new int [strs.length];
			for (int i=0; i<strs.length; i++) {
				num1[i] = Integer.parseInt(strs[i]);
			}
			//for (int i=0; i<strs.length; i++) {
			//	System.out.println(nums[i]);
			//}
			int ball = 0;
			int strike = 0;
			for (int i=0; i<num1.length; i++) {
				if(nums[i]==num1[i]) {
					strike ++;
				}
				for (int j=0; j<num1.length; j++) {
					if(nums[i]==num1[j]) {
						ball ++;
						break;
					}	
				}	
			}System.out.println("스트라이크: " +strike + ", 볼: " +(ball-strike));
			if (strike == 3) {
				break;
			}
			//if(1==1) {
			//	break;
			//}
		}
		System.out.println("게임이 끝났습니다.");
	}
}
