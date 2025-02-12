package p0205;

class Human{
	void work() {
		System.out.println("사람이라면 일을 해야지!");
	}
}

public class Father extends Human {
	public Father() {
		System.out.println(i);
		System.out.println("난 Father클래스 생성자!");		
	}
	int i = 1;
	
	public static void main (String[] args) {
		Father f = new Father();
		f.work();
	} 
}
