package p0207;

import java.util.ArrayList;

public class StringTest3 {
	public static void main (String[] args) {
		ArrayList<String> list = new ArrayList<> ();
		//list에 1부터 100까지의 값을 순서대로 추가해주세요.
		//반복문을 사용해서 차례대로 출력해주세요.
		//3,6,9가 있는 스트링은 짝으로 출력해주세요.
		for(int i=1; i<=100; i++) {
			list.add(i+"");
		}
		
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			if(str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.println("짝");
			}else {
				System.out.println(str);
			}
		}
		/*
		for(int i=0; i<list.size();i++) {
			String str = list.get(i);
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");
			
			System.out.println(str);
		}
		*/
	}

}
