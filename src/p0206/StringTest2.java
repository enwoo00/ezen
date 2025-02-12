package p0206;

class Test2{
	public int toInt() {//메소드정의
		return 1;
	}
	public String toString() {
		return "abc";
	}
}
public class StringTest2 extends Test2 {

	public static void main(String[] args) {
		StringTest2 st = new StringTest2();
		int num = st.toInt();//메소드 호출
		System.out.println(num);
		
	}
}
//오버라이딩
//상속관계
//메소드명이 같아야한다 동일
//데이터타입이같아ㅑ한다. toString()메소드를쓰려면 string타입이어야함-아빠께 이미 있으면 데이터타입을 맞춰야함,아니면 메소드명 변경