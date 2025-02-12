package p0212;

class Mother {
	final void test() {
		System.out.println("엄마 테스트");
	}
}
public class FinalMethod extends Mother {
	void test(int i) {
		System.out.println("그냥테스트()");
		
	}
	public static void main(String[] args) {
		FinalMethod fm = new FinalMethod();
		fm.test();//그냥 테스트 /final붙이면 엄마 테스트
		Mother m = new FinalMethod();
		m.test();//그냥 테스트. 오버라이딩 /final붙이면 엄마 테스트 /test(1)불가능.
		//메소드에 final을 붙이면 오버라이딩이 안됨. 같은 메소드명x
		//Object o = new FinalMethod();
	}

}
