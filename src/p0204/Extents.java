package p0204;

class Mother {
	int money = 100000;
	int age;
	void test() {
		System.out.println("난 엄마 ㅌ스트");
	}
}
	

public class Extents extends Mother{
	public static void main(String[] args) {
		
		Extents e = new Extents();

		e.test();
		System.out.println(e.age);
		System.out.println(e.money);
	
	}
}

