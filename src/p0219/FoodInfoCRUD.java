package p0219;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD {

	
	public int insertInfoCRUD (String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES ('%s',%d)";
		sql = String.format(sql, fiName, fiPrice);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteInfoCRUD (int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=%d";
		sql = String.format(sql, fiNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateInfoCRUD (int fiNum, String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME='%s', FI_PRICE=%d WHERE FI_NUM=%d";
		sql = String.format(sql, fiName, fiPrice, fiNum);
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();){
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectInfoCRUD() {
		List<Map<String,String>> foods = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
		try (Connection con = DBCon.getCon();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
			while(rs.next()) {
				Map<String,String> food = new HashMap<>();
				food.put("fiNum", rs.getString("FI_NUM"));
				food.put("fiName", rs.getString("FI_NAME"));
				food.put("fiPrice", rs.getString("FI_PRICE"));
				foods.add(food);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return foods;
	}
	public static void main (String [] args) {
		int result = 0;
		FoodInfoCRUD crud = new FoodInfoCRUD();
		//result = crud.insertInfoCRUD("빵", 1000);
		//result = crud.deleteInfoCRUD(15);
		//result = crud.updateInfoCRUD(17, "맛있는 볶음밥", 8000);
		List<Map<String,String>> foods =crud.selectInfoCRUD();
		for(Map<String,String> food:foods) {
			System.out.println(food);
		}
	}
}
