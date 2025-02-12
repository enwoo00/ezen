package p0210.review;

public class Loop {

	//2중포문 구구단
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(j*i));
			}
		}
		
	}
}
