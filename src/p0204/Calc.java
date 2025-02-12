package p0204;

public class Calc {

	int add(int n1, int n2) {
		return n1+n2;
	}
	int min(int n1, int n2) {
		return n1-n2;
	}
	int mul(int n1, int n2) {
		return n1*n2;
	}
	int div(int n1, int n2) {
		return n1/n2;
	}
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.div(8, 4);
		System.out.println(result);
		result = c.mul(2, 5);
		System.out.println(result);
		result = c.min(8, 5);
		System.out.println(result);
		result = c.add(2, 5);
		System.out.println(result);
		//minus, multiple, division 빼기 곱하기 나누기 
	}
}
