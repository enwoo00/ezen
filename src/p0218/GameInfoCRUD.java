package p0218;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
	static int insertGame (String giName, String giPrice, String giGenre, String giDesc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user="root";
		String pwd="r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES ('"
					+giName+"',"+giPrice+",'"+giGenre+"','"+giDesc+"')";
			return stmt.executeUpdate(sql); 
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	
	static int deleteGame(int giNum) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String user = "root";
		String pwd = "r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM GAME_INFO WHERE GI_NUM="+giNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	static int updateGame (int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/ezen";
		String user="root";
		String pwd="r1r2r3";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "UPDATE GAME_INFO SET GI_NAME='"+giName +"',GI_PRICE="+giPrice+",GI_GENRE='"+giGenre+"',GI_DESC='"+giDesc+"' WHERE GI_NUM="+giNum;
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	static List<Map<String,String>> getGame() {
		List<Map<String,String>> games = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/ezen";
		String user="root";
		String pwd="r1r2r3";
		Connection con = null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> game = new HashMap<>();
				String giNum=rs.getString("GI_NUM");
				String giName=rs.getString("GI_NAME");
				String giPrice=rs.getString("GI_PRICE");
				String giGenre=rs.getString("GI_GENRE");
				String giDesc=rs.getString("GI_DESC");
				game.put("giNum", giNum);
				game.put("giName", giName);
				game.put("giPrice", giPrice);
				game.put("giGenre", giGenre);
				game.put("giDesc", giDesc);
				games.add(game);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return games;
	}
	
	public static void main(String[] args) {
		int result = 0;
		//result = insertGame("동물의 숲","36000","힐링","귀엽다");
		//System.out.println(result+"개 추가");
		//result = deleteGame(2);
		//System.out.println(result+"개 삭제");
		//result = updateGame(3,"랄랄라","3000","몰라","게임인가");
		//System.out.println(result+"개 수정");
		
		List<Map<String,String>> games = getGame();
		for(Map<String,String> game : games) {
			System.out.print(game);
		}
		
	}

}
