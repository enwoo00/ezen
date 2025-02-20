package p0219;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD {
	public int insertInfoCRUD (String giName, int giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES ('%s',%d,'%s','%s')";
		sql = String.format(sql, giName, giPrice, giGenre, giDesc);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteInfoCRUD (int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=%d";
		sql = String.format(sql, giNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public int updateInfoCRUD(int giNum, String giName, int giPrice, String giGenre, String giDesc) {
		String sql = "UPDATE GAME_INFO SET GI_NAME='%s',GI_PRICE=%d,GI_GENRE='%s',GI_DESC='%s' WHERE GI_NUM=%d";
		sql = String.format(sql, giName, giPrice, giGenre, giDesc, giNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();) {
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectInfoCRUD () {
		List<Map<String,String>> games = new ArrayList<>();
		String sql = "SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while(rs.next()) {
				Map<String,String> game = new HashMap<>();
				game.put("giNum", rs.getString("GI_NUM"));
				game.put("giName", rs.getString("GI_NAME"));
				game.put("giPrice", rs.getString("GI_PRICE"));
				game.put("giGenre", rs.getString("GI_GENRE"));
				game.put("giDesc", rs.getString("GI_DESC"));
				games.add(game);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return games;
	}
	public static void main(String[] args) {
		GameInfoCRUD crud = new GameInfoCRUD();
		int result = 0;
		//result = crud.insertInfoCRUD("fff",800,"ddd","ff");
		//result = crud.deleteInfoCRUD(3);
		//result = crud.updateInfoCRUD(5, "피크민",0,"육성","옹쓰");
		List<Map<String,String>> games = crud.selectInfoCRUD();
		
		for(Map<String,String> game : games) {
			System.out.println(game);
		}
	}

}

/*
 * 1. Statement 사용 시
 * - Connection 연결
 * - 연결된 객체로 Statement 생성
 * - Sql 생성
 * - Statement로 Sql 실행
 * 
 * 2. PreparedSatement 사용 시 
 * - Connection 연결
 * - Sql 생성
 * - 연결된 객체로 Sql을 준비한 PreparedStatement 생성
 * - Sql의 물음표(?)에 값을 바인딩
 * - PreparedStatement로 실행
 * 
 * */
