package p0205;

class Test {
	static int num = 10;
}
public class AccessModifier {

	public static void main(String[] args) {
		//접근제어자
		// public protected(상속에서만) default(package-private),private
		System.out.println(Test.num);
		
	}
}
