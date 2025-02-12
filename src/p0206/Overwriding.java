package p0206;

class Father{
	void work() {
		System.out.println("아빠가 일합니다.");
	}
}
public class Overwriding extends Father {

	public static void main(String[] args) {
		Overwriding o = new Overwriding();
		Father f = new Overwriding();
	}
}
