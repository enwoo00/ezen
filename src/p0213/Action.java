package p0213;

public interface Action {
	
	//interface는 메소드의 선언만 가능하며 구현은 불가능하다(바디를 만들 수 없다)
	//interface에서 메소드의 접근제어자는 public만 가능하다, 즉 안쓰면 public
	//생성자를 생성할 수 없다. -> 메모리를 생성할 수 없다.
	void eat();//인터페이스는 퍼블릭밖에 못씀. 디폴트아님
	void play();
	void work();
	

}
