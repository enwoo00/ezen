package p0207;

import java.util.ArrayList;
import java.util.Random;

public class ListTest6 {
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i<10; i++) {
			list.add((r.nextInt(100)+1)+"");
		}
		//while(list.size()<10) {
		//	list.add(r.nextInt(100)+1+"");
		//}
		for(int i = 0; i<10; i++) {
			System.out.println(list.get(i));
		}
	}

}
