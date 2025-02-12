package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest5 {
	public static void main (String[] args) {
		ArrayList<Integer> nums = new ArrayList<>() ;
		Random r = new Random();
		for (int i=0; i<10; i++) {
			nums.add(r.nextInt(100)+1);
		}

		/*		
		while (nums.size()<10) {
			nums.add(r.nextInt(100)+1);
		}
		 */
		for(int i=0; i<nums.size(); i++) {
			int num = nums.get(i);
			if((num !=0 && num % 3 == 0) || (num % 3 == 0 && i>10)) {
				System.out.print("nums["+i+"]="+num);
				System.out.println("짝");
			} else {
				System.out.println("nums["+i+"]="+num);
			}
		}
		//for(int i=0; i<nums.size(); i++) {
		//	if(nums.get(i) % 10 == 3 || nums.get(i) % 10 == 6 || nums.get(i) % 10 == 7
		//		|| nums.get(i) / 10 == 3 || nums.get(i) / 10 == 6 || nums.get(i) / 10 == 7) {
		//		System.out.println("짝");
		//	} else {
		//		System.out.println("nums["+i+"]="+nums.get(i));
		//	}
		//}
		
		/*for(int i=0; i<nums.size(); i++) {
			System.out.println("nums["+i+"]="+nums.get(i));
		} */
		//nums에 1-100 난수 총 10개(중복가능)
		//반복문으로 출력, 3이나 6이나 7이라는 숫자가 있다면 짝
		
	}

}
