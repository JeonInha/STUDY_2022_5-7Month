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
		
		// File ��������
		// File ��ǲ��Ʈ��(���)
		// ���ϰ�ü �ʿ�
		// ClassLoader(Ŭ������ ������.)
		// getResource(url�� ����
		// getResourceAsStream: ��Ʈ���� ���·� ������.
		
		// ��ǲ��Ʈ�����·� �������� ���� Ŭ�����δ� 
		// ��ü�� ���� �ҽ��� ���� ��Ʈ�� �ؼ� ��Ʈ�����·� �� ��
		// �̰Ը�� ......?
		
		
		InputStream inStream = null;
		
		try {
			// ������Ƽ ���� �о ��ǲ��Ʈ�� ��üȭ
			inStream = DBUtil.class.getClassLoader()
					.getResourceAsStream("mysql.properties");
			properties.load(inStream);
			
			String driverClass = properties.getProperty("JDBC_DRIVER_CLASS");
			// ����̹��ε�(����))
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
