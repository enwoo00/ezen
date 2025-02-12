package p0210;

public class Gugudan {
	static void printGugudan (int dan) {
		for(int i=1; i<10; i++) {
			System.out.print(dan + "*" + i + "="+(dan*i));
			if(i!=9) {
			System.out.print(", ");
			}
		}

			//if (dan==9 && i==9) {
			//	System.out.print(dan + "*" + i + "="+dan*i);
			//} else
			//System.out.print(dan + "*" + i + "="+dan*i+", ");
			//System.out.println(" ");
	} 
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			printGugudan(i); 
			System.out.println();
		}
	}

}
