package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {
	public static void main(String[] args) {
		// 사용자한테 숫자를 입력받을 Scanner를 만듦.
		Scanner scan = new Scanner(System.in);
		//받을 숫자 1-100
		Random r = new Random();
		int rNum = r.nextInt(100)+1;
		System.out.println(rNum);
		int count = 1;
		//맞출때까지 반복
		while(true) {
			System.out.print("1-100 사이 입력한 숫자: ");
			String strNum = scan.nextLine();
			int num = Integer.parseInt(strNum);
			if(num>rNum) {
				System.out.println(num + "보다 작습니다.");
			}
			else if (num<rNum) {
				System.out.println(num + "보다 큽니다.");
			}
			else if (num==rNum) {
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			}
			//System.out.println("");
			/*String random = rNum + "";
			
			if(strNum.equals(random)) {
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			}
			*/
			count ++;
			
		}System.out.println("게임이 끝났습니다.");

	} 
}
