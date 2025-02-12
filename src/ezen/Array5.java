package ezen;

public class Array5 {

	public static void main(String[] args) {
		int[] nums = new int[10]; //0-9
		//nums의 반복문을 사용해서 2,4,6,8,10,12,14,16,18,20 입력하면 됩니다.
		//반복문을 사용해서 출력하면 됩니다.
		
		//for (int i=1; i<=10; i++) {
		//	nums[i-1] = i*2;
		//}
		
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (i+1)*2;
		}
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
