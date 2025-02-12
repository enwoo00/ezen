package p0205;

public class MethodTest4 {

	static void printGugudan (int n1) {
		for(int i=1; i<10; i++) {
			System.out.println(n1+ "X" + i + "=" + (n1*i));
		}
		
	}
	public static void main(String[] args) {
		//int dan =2;
		//printGugudan이라는 메소드룰 만들어
		//입력된 단을 출력하는 반복문 코드를 완성해주세요.
		for(int i = 1; i<10; i++) {
			printGugudan(i);
		}
		
		//for(int i=1; i<10; i++) {
			//System.out.println(dan+ "X" + i + "=" + (dan*i));
		//}
	}
}
