package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodInfoCRUD2 {

	public int insertInfoCRUD(String fiName, int fiPrice) {
		String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES (?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				) {
			ps.setString(1, fiName);
			ps.setInt(2, fiPrice);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteInfoCRUD(int fiNum) {
		String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setInt(1,fiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateInfoCRUD(int fiNum,String fiName, int fiPrice) {
		String sql = "UPDATE FOOD_INFO SET FI_NAME=?,FI_PRICE=? WHERE FI_NUM=?";
		try(Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);){
			ps.setString(1,fiName);
			ps.setInt(2,fiPrice);
			ps.setInt(3,fiNum);
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectInfoCRUD(String type, String str){
		List<Map<String,String>> foodInfos = new ArrayList<>();
		String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO ";
		if("1".equals(type)) {
			sql += "WHERE FI_NAME LIKE CONCAT('%',?,'%')";
		} else if("2".equals(type)) {
			sql += "WHERE FI_PRICE LIKE CONCAT('%',?,'%')";
		}
		try (Connection con =DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> foodInfo = new HashMap<>();
				foodInfo.put("fiNum", rs.getString("FI_NUM"));
				foodInfo.put("fiName", rs.getString("FI_NAME"));
				foodInfo.put("fiPrice", rs.getString("FI_PRICE"));
				foodInfos.add(foodInfo);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return foodInfos;
	}
	public static void main (String [] args) {
		FoodInfoCRUD2 crud = new FoodInfoCRUD2();
		int result = 0;
		//result = crud.insertInfoCRUD("공깃밥",1000);
		//result = crud.deleteInfoCRUD(20);
		//result = crud.updateInfoCRUD(19,"공깃밥",8000);
		List<Map<String,String>> foodInfos = crud.selectInfoCRUD("2", "1");
		for(Map<String,String> foodInfo : foodInfos) {
			System.out.println(foodInfo);
		}
	}
}
