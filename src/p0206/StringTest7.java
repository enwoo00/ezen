package p0206;

public class StringTest7 {
	
	public static void main(String[] args) {
		String str = "1,2,3,4,5,6,7,8,9,10";
		// ","를 기준으로 str을 분리하여
		//int[] nums에 저장한후
		//nums를 출력하면 됩니다.
		
		String[] str1 = str.split(",");
		//for ()
		//Integer.parseInt(str1);
		int[] nums = new int[str1.length];
		for (int i = 0; i<str1.length; i++) {
			nums[i] = Integer.parseInt(str1[i]);
		}
		for (int i = 0; i<str1.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
