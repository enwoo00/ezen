package p0205;

public class MethodTest2 {
	static int add(int n1, int n2) {
		return n1+n2;
	}
	static int min(int n1, int n2) {
		return n1-n2;
	}
	static int mul(int n1, int n2) {
		return n1*n2;
	}
	static int div(int n1, int n2) {
		return n1/n2;
	}
	static int mod(int n1, int n2) {
		return n1%n2;
	}

	public static void main(String[] args) {
		//MethodTest2 m = new MethodTest2();
		int n1 =10;
		int n2 = 4;
		//int result = add(n1, n2);
		//System.out.println(result);
		System.out.println(add(n1, n2));
		System.out.println(min(n1, n2));
		System.out.println(mul(n1, n2));
		System.out.println(div(n1, n2));
		System.out.println(mod(n1, n2));

	}
}
