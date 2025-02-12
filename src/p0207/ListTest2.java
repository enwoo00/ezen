package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest2 {

	public static void main (String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r =new Random();
		for(int i=0; i<10; i++) {
			nums.add(r.nextInt(100)+1);
		} 
		
		System.out.println(nums);
		int idx = nums.indexOf(1);
		System.out.println(idx);
		
	}
}
