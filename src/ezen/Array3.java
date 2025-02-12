package ezen;

public class Array3 {

	public static void main(String[] args) {
		String str = "3,9";
		String[] strs = str.split(",");
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//strs[0]값부터 strs[1]값까지 출력하는 반복문
		int min =  Integer.parseInt(strs[0]);
		int max =  Integer.parseInt(strs[1]);
		for(int i=min; i<=max; i++) {
			System.out.println(i);
			
		}
	}
}
