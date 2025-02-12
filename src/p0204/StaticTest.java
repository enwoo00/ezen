package p0204;

public class StaticTest {

	int num; //멤버변수
	String str;
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); //스텍티테스트 참조형
		System.out.println(st.str);
		System.out.println(st.num);
		st.num = 10;
		System.out.println(st.num);
	}
}
