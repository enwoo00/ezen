package p0206;

class Test{
	void test() {
		System.out.println("안녕. 전 Test입니다.");
	}
}
public class StringTest extends Test{

	void test() {
		System.out.println("안녕하세요. 전 String Test입니다.");
	}
	public static void main(String[] args) {
		
		
		StringTest st = new StringTest();
		st.test();
		System.out.println(st);
		Test t = new Test();
		t.test();
		Test t2 = new StringTest();
		t2.test();
		Object o = new StringTest();
		//((Test) o).test();
	}
}
