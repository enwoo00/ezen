package p0206;

public class Lotto3 {
	
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6};
		int[] lotto = new int[] {2,11,4,21,33,41};
		
		int correctNum = 0;
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				if(nums[i]==lotto[j]) {
					correctNum++;
					break;
				}
			}
		}
		System.out.print("맞춘 갯수 :" + correctNum);
	}
}
