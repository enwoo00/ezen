package p0214;

public class Print {
	public static void main(String[] args) {
		int age = 1;
		String name = "홍길동";
		System.out.println("나이 : " +age+", 이름 : " +name);
		System.out.printf("나이 : %d, 이름 : %s ", age, name);
		
		int x = 0;
		System.out.printf("x=%d 일 때, 참인것은 %n", x);
		
		if(x==0) System.out.println("x==0");
		if(x==0) System.out.println("x==0");
		if(x==0) System.out.println("x==0");
		if(x==0) System.out.println("x==0");
	}

}
