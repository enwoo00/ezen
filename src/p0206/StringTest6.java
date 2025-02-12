package p0206;

public class StringTest6 {
	
	public static void main(String[] args) {
		String str = "korea";
		System.out.println(str.length());
		str = str.toUpperCase();
		System.out.println(str);
		str = str.toLowerCase();
		System.out.println(str);
		
		boolean startK = str.startsWith("K");
		System.out.println(startK);
		boolean endA = str.endsWith("a");
		System.out.println(endA);
		
		str = "k,o,r,e,a";
		String[] strs = str.split(",");
		
		for(int i=0;i<strs.length; i++) {
			System.out.print("strs["+i+"] :" + strs[i] + ",");
		}
		
		System.out.println();
		str = "";
		boolean isBlank = str.isBlank();
		System.out.println(isBlank);
		boolean isEmpty = str.isEmpty();
		System.out.println(isEmpty);
	}

}
