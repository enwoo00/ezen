package p0210;

public class Gugudan2 {
	public static void main(String[] args) {
		String dan ="1";
		int danNum = Integer.parseInt(dan);
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + "*" + i + "="+(danNum*i));
		}
	}

}
