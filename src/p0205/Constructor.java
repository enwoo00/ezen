package p0205;

public class Constructor {
	public Constructor() {
		System.out.println("랄랄라라");
		System.out.println("랄랄라라");
		System.out.println("랄랄라라");
		System.out.println("랄랄라라");
		System.out.println("랄랄라라");
		System.out.println("랄랄");
		
	}

	//생성자 조건
	//클래스 명과 동일
	//타입x
	//생성자가 하나도 없을때 기본생성자 생성
	
	//스캐너-기본생성자없음, System.in
	public static void main(String[] args) {
		Constructor c = new Constructor();
		System.out.println(c);
	}
}
