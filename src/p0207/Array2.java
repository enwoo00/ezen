package p0207;

import java.util.Random;

public class Array2 {


	public static void main (String[] args) {
		int[] nums = new int[10];
		//1부터 100까지의 난수를 nums에 대입
		//짝수일경우에만
		Random r =new Random();
		for(int i=0; i<nums.length; i++) {
			nums[i] = r.nextInt(100)+1;
			if(nums[i]%2==1 || nums[i]%3 !=0 && nums[i]%5 !=0 ) {
				i--;
			} 
		} 
		Array.printArray(nums);
		/*
		for(int i=0; i<nums.length; i++) {
			int tmp = r.nextInt(100)+1;
			if(tmp%2==0) {
				nums[i] = tmp;
			} else {
				i--;
				//break;
			}
		} 

		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		} */
	}
}
