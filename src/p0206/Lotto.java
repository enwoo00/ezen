package p0206;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		//1-45사이 난수 생성하여 반복문으로 nums배열에 대입,출력
		Random r =new Random();
		for(int i = 0; i<nums.length; i++) {
			nums[i] = r.nextInt(45)+1;
			
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//스캐너 클래스를 사용해 1-45사이 숫자 ","기준으로 6개 입력받아
		//int[] lotto에 저장하여
		//위에서 생성된 nums와 비교해 몇개의 숫자가 맞았는지 출력하는 코드
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("1부터 45까지의 6개 숫자를 ,를 기준으로 입력해주세요 : ");
		String str = s.nextLine();
		String strs [] = str.split(",");
		
		/*
		 * */
		int[] lotto = new int[strs.length];
		int stack = 0;
		for (int i = 0; i<strs.length; i++) {
			lotto[i] = Integer.parseInt(strs[i]);
		}
		for (int i = 0; i<strs.length; i++) {
			for (int j = 0; j<lotto.length; j++) {
				if(nums[i]==lotto[j]) {
					stack += 1;
				} else {}
			}
		}
		System.out.print("맞춘 갯수 :" + stack);
	}

}
