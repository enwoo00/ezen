package p0217;

public class Scope {
	public Scope() {//생성자
		System.out.println("1 내 메모리를 생성했구나~");
	}
	
	{
		//초기화 블럭, 생성자 실행되기 전에
		System.out.println("2");
	}
	public static void main(String[] args) {
		
		System.out.println("2");
		//new Scope();
	}

}
