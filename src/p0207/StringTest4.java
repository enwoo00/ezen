package p0207;

public class StringTest4 {
	public static void main (String[] args) {
		String str = "1,2,3,4,5,6,8";
		//replace를 사용하지않고
		//"," 모두 제거한 후 str의 값을 출력.
		//String[] strs = str.split(",");
/*
		String tmpStr="";
		for(int i=0; i<str.length();i++) {
			String s =str.substring(i, i+1);
			if (!",".equals(s)) {
				tmpStr += s;
			}
		}
		System.out.print(tmpStr);
		*/
		
		String[] strs = str.split(",");
		//String tmpStr="";
		str="";
		for(int i=0; i<strs.length;i++) {
			str += strs[i];
			//String str1 = strs[i];
			//System.out.print(str1);
		}
		//str = tmpStr;
		System.out.print(str);
		
	}

}
