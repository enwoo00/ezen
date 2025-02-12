package p0210.review;

public class Calc {
	
		//리턴하지 않으면서 메모리 생성을 안하고 싶을때
	static void printAdd(int n1, int n2) {
		System.out.println(n1+n2);
	}
		//리턴하면서 메모리 생성을 안하고 싶을때
	static int add (int n1, int n2) {
		return(n1+n2);
	}
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		printAdd(n1,n2);
		System.out.println(add(n1,n2));

	}

}

