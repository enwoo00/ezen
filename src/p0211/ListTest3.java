package p0211;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>();
		Random r = new Random();
		//1-45난수, strs사이즈 6이 될때까지 추가, 중복 제거
		while (strs.size()<6) {
			String rNum = r.nextInt(45)+1+"";
			if(strs.indexOf(rNum)==-1) {
				strs.add(rNum);
			}
		}System.out.println(strs);
	}
}
