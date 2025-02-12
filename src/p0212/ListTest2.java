package p0212;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//5개의 게임을 만들어주세요.
		/*
		 * 1. name=삼국지,price=30000,genre=전략
		 * 2. name=LOL,price=0,genre=실시간전략
		 * 3. name=카트라이더,price=0,genre=스포츠
		 * 4. name=스타크래프트,price=15000,genre=실시간전략
		 * 5. name=오버워치,price=32000,genre=RTS*/
		

		Game g1 = new Game();
		g1.setName("삼국지");
		g1.setPrice(30000);
		g1.setGenre("전략");
		
		Game g2 = new Game();
		g2.setName("LOL");
		g2.setPrice(0);
		g2.setGenre("실시간전략");
		
		Game g3 = new Game();
		g3.setName("카트라이더");
		g3.setPrice(0);
		g3.setGenre("스포츠");
		
		Game g4 = new Game();
		g4.setName("스타크래프트");
		g4.setPrice(15000);
		g4.setGenre("실시간전략");
		
		Game g5 = new Game();
		g5.setName("오버워치");
		g5.setPrice(32000);
		g5.setGenre("RTS");
		
		ArrayList<Game> gameList = new ArrayList<>();
		gameList.add(g1);
		gameList.add(g2);
		gameList.add(g3);
		gameList.add(g4);
		gameList.add(g5);
		/*
		for(Game g:gameList) {
			//장르에 "전략"이라는 단어가 들어간 게임만 출력 && price가 0원이 아닌것
			//String genre = g.getGenre();
			//if(g.getGenre().indexOf("전략")!=-1&&g.getPrice()!=0) {
			if(g.getGenre().contains("전략")&&g.getPrice()!=0) {
				System.out.println(g);
			}
			
		}
		*/
		
		for(Game g:gameList) {
			//price가 15000원 이상 30000원 미만인 것만 출력
			if(15000<=g.getPrice() &&  g.getPrice()<30000) {
				System.out.println(g);
			}
		}
		
		//System.out.println(gameList);
		

		/*Game[] games = new Game[] {g1,g2,g3,g4,g5};
		for(Game g: games) {
			System.out.println(g);
		}*/
		
		
		
		
		
		/*
		int[] gamePrice = new int[] {30000,0,0,15000,32000};
		String[] gameName = new String[] {"삼국지","LOL","카트라이더","스타크래프트","오버워치"};
		String[] genreName = new String[] {"전략","실시간전략","스포츠","실시간전략","RTS"};
		ArrayList<Game> gameList = new ArrayList<>();
		for(int i = 0; i<5; i++) {
			Game g = new Game();
			g.setName(gameName[i]);
			g.setPrice(gamePrice[i]);
			g.setGenre(genreName[i]);
			gameList.add(g);
		}
		
		for(Game g:gameList) {
			System.out.println(g);
		}
		*/
		
		
		
	}
}
