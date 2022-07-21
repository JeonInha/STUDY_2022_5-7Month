package ko.co.greenart.dbutil;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	private final static Properties properties = new Properties();
	
	static {
		
		// File 읽으려면
		// File 인풋스트림(경로)
		// 파일객체 필요
		// ClassLoader(클래스를 가져옴.)
		// getResource(url로 얻어옴
		// getResourceAsStream: 스트림의 형태로 가져옴.
		
		// 인풋스트림형태로 가져오기 위해 클래스로더 
		// 객체로 벨류 소스를 애즈 스트림 해서 스트림형태로 얻어낸 것
		// 이게모냐 ......?
		
		
		InputStream inStream = null;
		
		try {
			// 프로퍼티 파일 읽어서 인풋스트림 객체화
			inStream = DBUtil.class.getClassLoader()
					.getResourceAsStream("mysql.properties");
			properties.load(inStream);
			
			String driverClass = properties.getProperty("JDBC_DRIVER_CLASS");
			// 드라이버로드(적재))
			Class.forName(driverClass);


		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static Connection getConnection() throws SQLException {
		String url = properties.getProperty("JDBC_URL");
		String id = properties.getProperty("JDBC_USERNAME");
		String pw = properties.getProperty("JDBC_PASSWORD");
		
		return DriverManager.getConnection(url, id, pw);
	}
	
	
	public static void closeConn(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeStmt(Statement stmt) {
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void closeRs(ResultSet rs) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
