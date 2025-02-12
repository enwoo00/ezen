package p0206;

class Mother {
	void work() {
		System.out.println("어머님이 일하신다.");
	}
}
public class Overriding extends Mother {
	void work() {
		System.out.println("내가 일하신다.");
	}
	//홍길동은ㅅ ㅏ람으로 부릀 ㅜ있다. 즉 사람s=new홍길동()이 가능하지만 사람은 홍길동이라고 부를수없다 즉 홍길동h=new사람()은불가능
	public static void main(String[] args) {
		Overriding o = new Overriding();
		String str = o.toString();
		o.work();
		Mother m = new Overriding();
		m.work(); //오버라이딩의 work()
	//Overriding o2 = new Mother();불가능	
	}
}
