package p0211;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		
		
		while (lotto.size()<6) {
			int rNum = r.nextInt(45)+1;
			if(lotto.indexOf(rNum)==-1) {
				lotto.add(rNum);
				
			}
		} System.out.println(lotto);
		//1부터 45까지의 난수 6개를 lotto에 추가, 중복 제거, 추가한 후 lotto의 값을 출력.
		int tmp = 0;
		for(int i=0; i<lotto.size(); i++) {
			if (tmp==0) {
				tmp = lotto.get(i);				
			} else if (lotto.get(i)<tmp) {
				tmp = lotto.get(i);
				
				//lotto.set(lotto.indexOf(tmp),lotto.get(i));
				//lotto.set(i,tmp);
				//lotto.set(i-1,lotto.get(i));
				//lotto.set(i,tmp);
				
			}
		}System.out.println(lotto);
	}
	

}
