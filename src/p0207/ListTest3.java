package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {
	public static void main (String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r =new Random();
		for(int i=1; i<=6; i++) {
			nums.add(r.nextInt(45)+1);
			//System.out.println("nums["+i+"]="+nums.get(i));
		} 
		for(int i=0; i<nums.size(); i++) {
			//nums.add(r.nextInt(45)+1);
			System.out.println("nums["+i+"]="+nums.get(i));
		} 
		//System.out.println(nums);
		//int idx = nums.indexOf(1);
		//System.out.println(idx);
		
	}

}
