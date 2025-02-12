package p0205;

public class Loop2 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			/*
			 * if(i%5==0) {
			 * 	if( i%10==3 || i/10==3) {
				System.out.println("만세짝");
			 * } else {
			 * 	System.out.println("만세");	
			 * }*/
			if(i%5==0 && (i%10==3 || i/10==3)) {
				System.out.println("만세짝");
			}else if (i%5==0) {
				System.out.println("만세");
			}else if ( i%10==3 || i/10==3) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}
}
