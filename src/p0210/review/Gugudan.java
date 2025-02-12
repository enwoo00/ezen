package p0210.review;

public class Gugudan {
	static void printGugudan (int dan) {
		for(int i = 1; i<=9; i++) {
			System.out.print(dan+"*"+i+"="+(i*dan));
			if (i!=9) {
				System.out.print(", ");
			}
		}
	}

	public static void main(String[] args) {
		//printGugudan(1);
		for(int i = 1; i<=9; i++) {
			printGugudan(i);
			System.out.println();
		}
	}
	//메소드 구구단
}
