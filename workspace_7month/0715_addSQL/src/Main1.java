import java.sql.*;

public class Main1 {
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			
			// table A: 컬럼 B varchar(10) pk. 만들 것.
			
			String query = "create table a (b varChar(10) primary key);";
			// sql명령 문자열
			stmt = conn.createStatement();
			// 명령을 수행해주는 객체.
			// stmt.executeUpdate(query);
			// 명령을 날림!
			// executeUpdate: 수정작업을 할 때 쓰는 메소드: 추가, 생성, 변경, 삭제
			String query2 = "drop table a;";
			stmt.executeUpdate(query2);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 나중에 연 객체를 제일 먼저 닫음. stack 생각. 후입선출
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
