import java.sql.*;

public class Main2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/world";
		// "jdbc:mysql://localhost:(포트주소)/원하는데이터베이스";
		String id = "root";
		String pw = "root";
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("데이터베이스 연결 성공");

			///
			// 다쓰고나면 닫고 로그아웃 해줘야 함.

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("데이터베이스 연결에 성공하였습니다.");
		} finally {
			if (conn != null)
				try {
					conn.close();
					System.out.println("연결 종료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}
}
