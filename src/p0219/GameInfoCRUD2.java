package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInfoCRUD2 {
	public int insertInfoCRUD(String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "INSERT INTO GAME_INFO(GI_NAME, GI_PRICE, GI_GENRE, GI_DESC) VALUES (?,?,?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1,giName);
			ps.setString(2,giPrice);
			ps.setString(3,giGenre);
			ps.setString(4,giDesc);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteInfoCRUD(int giNum) {
		String sql = "DELETE FROM GAME_INFO WHERE GI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(1, giNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateInfoCRUD(int giNum, String giName, String giPrice, String giGenre, String giDesc) {
		String sql = "UPDATE GAME_INFO SET GI_NAME=?,GI_PRICE=?,GI_GENRE=?,GI_DESC=? WHERE GI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, giName);
			ps.setString(2, giPrice);
			ps.setString(3, giGenre);
			ps.setString(4, giDesc);
			ps.setInt(5, giNum);
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectInfoCRUD (String type, String str) {
		List<Map<String,String>> gameInfos = new ArrayList<>();
		String sql ="SELECT GI_NUM, GI_NAME, GI_PRICE, GI_GENRE, GI_DESC FROM GAME_INFO";
		if("1".equals(type)) {
			sql += " WHERE GI_NAME LIKE CONCAT('%',?,'%')";
		} else if("2".equals(type)) {
			sql += " WHERE GI_PRICE LIKE CONCAT('%',?,'%')";
		} else if("3".equals(type)) {
			sql += " WHERE GI_GENRE LIKE CONCAT('%',?,'%')";
		} else if("4".equals(type)) {
			sql += " WHERE GI_DESC LIKE CONCAT('%',?,'%')";
		}
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> gameInfo = new HashMap<>();
				gameInfo.put("giNum",rs.getString("GI_NUM"));
				gameInfo.put("giName",rs.getString("GI_NAME"));
				gameInfo.put("giPrice",rs.getString("GI_PRICE"));
				gameInfo.put("giGenre",rs.getString("GI_GENRE"));
				gameInfo.put("giDesc",rs.getString("GI_DESC"));
				gameInfos.add(gameInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gameInfos; 
	}
	public static void main (String[] args) {
		GameInfoCRUD2 crud = new GameInfoCRUD2();
		//int result = crud.insertInfoCRUD("게임", "2000", "액션", "겜");
		//int result = crud.deleteInfoCRUD(6);
		//int result = crud.updateInfoCRUD(7,"마인크래프트", "32000", "서바이벌", "겜");
		List<Map<String,String>> gameInfos = crud.selectInfoCRUD("3","육성");
		for(Map<String,String> gameInfo : gameInfos) {
			System.out.println(gameInfo);
		}
	}

}
