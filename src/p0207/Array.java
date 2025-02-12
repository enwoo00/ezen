package p0207;

public class Array {
	static void printArray(int[] nums) {
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main (String[] args) {
		//배열
		//여러개의 변수를 한번에/ 한번정한크기를바꿀수없다
		
		int[] nums = new int[] {10,4,2,3};
		printArray(nums);
		int[] tmpNums = nums;
		nums = new int[5];
		printArray(nums);
		for(int i = 0; i<tmpNums.length; i++) {
			nums[i] = tmpNums[i];
		}
		printArray(nums);
	}
}
