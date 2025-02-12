package p0204;

public class Food extends Object {

	int price;
	String name;
	public String toString() {
		return "가격 : " + price + ", 이름 : " + name;
	}
	
	public static void main(String[] args) {
		Food f =new Food();
		f.name = "참치김밥";
		f.price=5000;
		
		//System.out.println(f); //메모리주소 출력
		//String str = f.toString();
		//System.out.println(str);
		System.out.println(f);
		
	}
}
