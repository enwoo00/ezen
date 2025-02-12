package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest4 {
	public static void main (String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		for (int i = 1; i<=10; i++) {
			int rNum = r.nextInt(10)+1;
			//nums.add(r.nextInt(10)+1);
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
				//i++;
			} else {
				i--;
				}
		}
		/*while(nums.size()<10) {
			int rNum = r.nextInt(10)+1;
			if(nums.indexOf(rNum) == -1) {
				nums.add(rNum);
			}
		}*/
		
		/*for (int i = 1; i<=10; i++) {
			int rNum = r.nextInt(10)+1;
			if(nums.indexOf(rNum) != -1) {
				i--;
				break;
			} 
			nums.add(rNum);
		}*/
		for (int i = 0; i<10; i++) {
			System.out.println("nums["+i+"]="+nums.get(i));
		}
		
	}
}
