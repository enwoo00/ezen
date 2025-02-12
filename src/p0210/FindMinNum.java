package p0210;

import java.util.ArrayList;
import java.util.Random;

public class FindMinNum {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random r = new Random();
		while(nums.size()<10) {
			int rNum = r.nextInt(50)+1;
			if (nums.indexOf(rNum)==-1) {
				nums.add(rNum);
			}
		}
		//nums.add(1);
		
		/*for(int i=1; i<=6; i++) {
			int rNum = r.nextInt(2);
			if(nums.indexOf(rNum)==-1) {
				nums.add(rNum);
			}
		}*/
		
		//System.out.println(nums.indexOf(1));
		System.out.println(nums);
		int tmp = 0;
		for(int i=0; i<nums.size(); i++) {
			if(tmp==0) {
				tmp = nums.get(i);
			}else if (tmp<nums.get(i)) {
				tmp = nums.get(i);
			}
		/*int tmp = 0;
		for(int i=0; i<nums.size(); i++) {
			if(tmp==0) {
				tmp = nums.get(i);
			}else if (tmp>nums.get(i)) {
				tmp = nums.get(i);
			}*/
			//System.out.println(tmp);
			
		}//System.out.println("가장 작은 수: " + tmp);
		System.out.println("가장 큰 수: " + tmp);
	}
}
