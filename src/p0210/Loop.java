package p0210;

public class Loop {

	public static void main(String[] args) {
		//1단부터 9단까지 출력하는 2중포문
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + "*" + j + "=" + (j*i));
				if(j!=9) {
					System.out.print(", ");
				} 
			}
			System.out.println();
		}
	}
}
