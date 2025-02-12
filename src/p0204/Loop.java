package p0204;

public class Loop {
	
	public static void main(String[] args) {
		//총 9개의 포문을 사용해서
		//구구단 1단부터 0단까지 출력
		//int[] nums = new int[9];
		for(int i =1; i<10; i++) {
			System.out.println(1 + "X" + i + " = " + (1*i));
			//System.out.println("")
		}
		
		for(int i =1; i<10; i++) {
			System.out.println(2 + "X" + i + " = " + (2*i));
			//System.out.println("")
		}
		
		for(int i =1; i<10; i++) {
			for(int j =1; j<10; j++) {
				System.out.println(i + "X" + j + " = " + (j*i));
				//System.out.println("")
			}
		}
	}

}
