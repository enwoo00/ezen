package p0210.review;

public class Gugudan2 {

	//스트링 구구단
	public static void main (String[] args) {
		String dan ="1";
		int danNum = Integer.parseInt(dan);
		for(int i = 1; i<=9; i++) {
			System.out.println(danNum+"*"+i+"="+(i*danNum));
		}
	}
}
