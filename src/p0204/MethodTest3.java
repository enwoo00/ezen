package p0204;

public class MethodTest3 {
	int coffeePrice = 1000;
	int getCoffee(int money) {
		return money - coffeePrice;
	}
	public static void main(String[] args) {
		MethodTest3 mt = new MethodTest3();//스태틱이 아니므로 메모리 생성
		//getCoffee를 2000을 넣고 호출했을때 커피값을 뺀 나머지 잔돈을 출력하는 코딩
		int change = mt.getCoffee(2000);
		System.out.println("잔돈은 "+change+"원 입니다.");
	}
}
