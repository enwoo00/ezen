package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import p0217.DataBaseConnector;

public class InsertDB {
	
	public static void main(String[] args) {
		/*try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username = "root";
		String password = "r1r2r3";*/
		try {
			Connection con = DataBaseConnector.getCon();
					//DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO FOOD_INFO(FI_NAME, FI_PRICE)";
			sql += " VALUES('참치김밥',2000)";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("입력 성공!!");
			}else {
				System.out.println("오류는 안났지만 입력은 안됐어요.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
