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

public class FoodInfoCRUD {

	static List<Map<String,String>> getFoods() {
		List<Map<String,String>> foods = new ArrayList<>();
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
			String sql = "SELECT FI_NUM, FI_NAME, FI_PRICE FROM FOOD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,String> food = new HashMap<>();
				String fiNum = rs.getString("FI_NUM");
				String fiName = rs.getString("FI_NAME");
				String fiPrice = rs.getString("FI_PRICE");
				food.put("fiNum", fiNum);
				food.put("fiName", fiName);
				food.put("fiPrice", fiPrice);
				foods.add(food);
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
		return foods;
	}
	
	static int insertFoods(String fiName, String fiPrice) {
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
			String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE) VALUES ('"+fiName+"', "+fiPrice+")";
			return stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	
	static int deleteFoods(int fiNum) {
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
			String sql = "DELETE FROM FOOD_INFO WHERE FI_NUM="+fiNum;
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
	
	static int updateFoods(int fiNum,String fiName, int fiPrice) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url ="jdbc:mysql://localhost:3306/ezen";
		String user="root";
		String pwd="r1r2r3";
		Connection con = null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			Statement stmt = con.createStatement();
			String sql = "UPDATE FOOD_INFO SET FI_NAME='"+fiName+"',FI_PRICE="+fiPrice+ " WHERE FI_NUM="+fiNum;
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
	
	public static void main(String[] args) {

		int result = 0;
		//int result = insertFoods("김치볶음밥","5000");
		//System.out.println("입력한 갯수 : " + result);
		//result = deleteFoods(12);
		//System.out.println("삭제한 갯수 : " + result);
		result = updateFoods(16,"잡채밥",3000);
		System.out.println("수정한 갯수 : " + result);
		List<Map<String,String>> foods = getFoods();
		for(Map<String,String> food : foods) {
			System.out.println(food);
		}
		

	}
}
