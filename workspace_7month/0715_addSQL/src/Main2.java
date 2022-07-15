import java.sql.*;

public class Main2 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/my_db";
		String id = "root";
		String pw = id;
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	public static int insertBook(String title, int price) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		
		try {
		conn = makeConnection();
		stmt = conn.createStatement();
		stmt.executeUpdate("insert into books (title, price) values ('"+title+"', "+String.valueOf(price)+");");
		System.out.println("실행했음!");
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return 0;
	}
	
	public static void selectAllBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = makeConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from books");
			// select문의 경우 executeUpdate 말고 executeQuery 사용
			// select문의 경우 resultSet 객체 반환
			while (rs.next()) {
				// rs.next(); // 값의 유무 여부를 boolean으로 반환
				int id = rs.getInt("bookid");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				System.out.printf("[id: %d | %s, %d원]\n", id, title, price);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if (stmt !=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		selectAllBook();
	}
}
