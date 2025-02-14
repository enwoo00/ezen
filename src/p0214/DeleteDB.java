package p0214;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/ezen";
		String username="root";
		String password="r1r2r3";
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM FOOD_INFO";
			sql += " WHERE FI_NUM=11";
			int result = stmt.executeUpdate(sql);
			if(result>=1) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트가 되지 않음");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
