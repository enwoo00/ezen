package p0206;

public class StringTest5 {

	public static void main (String[] args) {
		String str = " 우 리 나 라 ";
		int idx = str.indexOf(" ");//0, 앞에서부터 검색
		System.out.println(idx);
		idx = str.lastIndexOf(" ");//8, 뒤에서부터 검색
		System.out.println(idx);
		System.out.println(str.replace(" ", ""));
		str = str.trim(); //앞뒤 공백 제거
		System.out.println(str);
		
		idx = str.indexOf("타");//-1
		if(str.indexOf("타")!=-1) {
			System.out.println("str에는 타라는 글자가 있다.");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
		
		boolean hasTa = str.contains("타");
		System.out.println(hasTa);
//		System.out.println(str.contains("타"));
		if(str.contains("타")) {
			System.out.println("str에는 타라는 글자가 있다.");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
	}

}
