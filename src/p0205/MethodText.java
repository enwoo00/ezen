package p0205;

public class MethodText {
	
	int test() {
		return 1;
	}
	
	static void test2() {
		
	}
	public static void main (String[] arg) 
	{
		MethodText mt = new MethodText();
		mt.test();
		test2();
		int i = mt.test();
		
	}
}
