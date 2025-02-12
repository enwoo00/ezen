package p0212;

public class FinalTest {
//class 앞에 final이 붙으면 상속시킬수없음. 예시:String
	final int I=1;;
	public static void main(String[]args) {
		final int i =1;
		//i=2;
		System.out.println(i);
		FinalTest ft = new FinalTest();
		System.out.println(ft.I);
	}
}
