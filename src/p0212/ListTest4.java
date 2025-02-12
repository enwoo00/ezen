package p0212;

import java.util.ArrayList;

public class ListTest4 {

	public static void main(String[] args) {
		Game2 g1 = new Game2();
		g1.setName("동물의숲");
		g1.setCapacity(1.5);
		g1.setCompany("닌텐도");
		Game2 g2 = new Game2();
		g2.setName("오버워치");
		g2.setCapacity(5.8);
		g2.setCompany("블리자드");
		Game2 g3 = new Game2();
		g3.setName("테일즈런너");
		g3.setCapacity(6.6);
		g3.setCompany("한게임");
		Game2 g4 = new Game2();
		g4.setName("사천성");
		g4.setCapacity(1.0);
		g4.setCompany("넷마블");
		Game2 g5 = new Game2();
		g5.setName("피크민");
		g5.setCapacity(8.5);
		g5.setCompany("나이언틱");
		Game2 g6 = new Game2();
		g6.setName("모두의마블");
		g6.setCapacity(4.2);
		g6.setCompany("넷마블");
		
	
		ArrayList<Game2> gameList2 = new ArrayList<>();
		gameList2.add(g1);
		gameList2.add(g2);
		gameList2.add(g3);
		gameList2.add(g4);
		gameList2.add(g5);
		gameList2.add(g6);
		
		for(Game2 g : gameList2) {
			if(g.getCapacity()>1.1 && g.getCompany().equals("넷마블")) {
				System.out.println(g);
			}
				
			
		}
	}
}
