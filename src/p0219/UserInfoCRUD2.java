package p0219;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInfoCRUD2 {
	public int insertInfoCRUD(String uiName, String uiId, String uiPwd) {
		String sql = "INSERT INTO USER_INFO(UI_NAME, UI_ID, UI_PWD) VALUES(?,?,?)";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				){
			ps.setString(1, uiName);
			ps.setString(2, uiId);
			ps.setString(3, uiPwd);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int deleteInfoCRUD(int uiNum) {
		String sql = "DELETE FROM USER_INFO WHERE UI_NUM=?";
		try (Connection con = DBCon.getCon();
				PreparedStatement ps =con.prepareStatement(sql);
				){
			ps.setInt(1, uiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int updateInfoCRUD(int uiNum, String uiName, String uiId, String uiPwd) {
		String sql ="UPDATE USER_INFO SET UI_NAME=?, UI_ID=?, UI_PWD=? WHERE UI_NUM=?";
		try(Connection con =DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				) {
			ps.setString(1, uiName);
			ps.setString(2, uiId);
			ps.setString(3, uiPwd);
			ps.setInt(4, uiNum);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public List<Map<String,String>> selectInfoCRUD(String type, String str){
		List<Map<String,String>> userInfos = new ArrayList<>();
		String sql = "SELECT UI_NUM, UI_NAME, UI_ID, UI_PWD FROM USER_INFO ";
		if("1".equals(type)) {
			sql += "WHERE UI_NAME LIKE CONCAT ('%',?,'%')";
		} else if("2".equals(type)) {
			sql += "WHERE UI_ID LIKE CONCAT ('%',?,'%')";
		} else if("3".equals(type)) {
			sql += "WHERE UI_PWD LIKE CONCAT ('%',?,'%')";
		}
		try (Connection con = DBCon.getCon();
				PreparedStatement ps = con.prepareStatement(sql);
				){
			ps.setString(1, str);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Map<String,String> userInfo = new HashMap<>();
				userInfo.put("uiNum", rs.getString("UI_NUM"));
				userInfo.put("uiName", rs.getString("UI_NAME"));
				userInfo.put("uiId", rs.getString("UI_ID"));
				userInfo.put("uiPwd", rs.getString("UI_PWD"));
				userInfos.add(userInfo);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfos;
	}
	public static void main (String[] args) {
		UserInfoCRUD2 crud = new  UserInfoCRUD2();
		int result = 0;
		//result = crud.insertInfoCRUD("랄랄라", "ddd", "ererer");
		//result = crud.deleteInfoCRUD(8);
		//result = crud.updateInfoCRUD(9,"고고고", "GO", "Gererer");
		List<Map<String,String>> userInfos = crud.selectInfoCRUD("2", "N");
		for(Map<String,String> userInfo : userInfos) {
			System.out.println(userInfo);
		}
	}

}
