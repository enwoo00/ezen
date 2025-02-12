package p0204;

public class MethodTest {

	int i;
	static void test() {
		System.out.println("첫번째 테스트");
	}
	static void test(int i) {
		System.out.println("두번째 테스트");
	}
	static void test(String i2) {
		System.out.println("세번째 테스트");
	}
	
	static void test(int i, String i2) {
		System.out.println("네번째 테스트");
	}
	
	static int test(String i, int i2 ) {
		System.out.println("다섯번째 테스트");
		return 1; 
	}
	//데이터타입은 상관없음, 해당x. 같은 영역이어야함
	public static void main(String[] args) {
		test();
	}
}
