package p0206;

import java.util.Random;
import java.util.Scanner;

public class Lotto2 {
	static boolean exists(int[] nums, int num) {
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
		
	}
	
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
		
		int correctNum = 0;
		for(int i = 0; i<lotto.length; i++) {
			if(exists(nums, lotto[i])) {
				correctNum ++;
			}
		}
		System.out.print("맞춘 갯수 :" + correctNum);
	}

}
